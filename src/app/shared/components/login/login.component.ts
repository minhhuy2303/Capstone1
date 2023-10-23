import { AuthServiceService } from './../../../service/auth/auth-service.service';
import { FormBuilder, Validators } from '@angular/forms';
import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { ToastrService } from 'ngx-toastr';
import { UserService } from 'src/app/service/user/user.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css'],
})
export class LoginComponent {
  [x: string]: any;
  constructor(
    private toastr: ToastrService,
    private http: HttpClient,
    private formBuilder: FormBuilder,
    private user: UserService,
    private router: Router
  ) {}
  url = 'localhost:8080/authenticate';
  infoUser = this.formBuilder.group({
    username: ['', [Validators.required]],
    password: ['', [Validators.required]],
  });
  get validateForm() {
    return this.infoUser.controls;
  }
  userLogin() {
    if (!this.infoUser.valid) {
      this.toastr.error('Vui lòng kiểm tra lại thông tin');
    } else {
      let dataUser = {
        userName: this.infoUser.value.username,
        userPassword: this.infoUser.value.password,
      };
      this.user.login(dataUser).subscribe(
        (res) => {
          console.log(res);
          localStorage.setItem('login', JSON.stringify(true));
          this.toastr.success('Đăng nhập thành công');
          if (res.role.name == 'ROLE_USER') {
            this.router.navigate(['/home']);
          } else if ((res.role.name = 'ROLE_ADMIN')) {
            this.router.navigate(['/admin/dashboard']);
          } else if ((res.role.name = 'ROLE_DOCTOR')) {
            this.router.navigate(['/homebs']);
          }
        },
        (err) => {
          console.log(err);
          this.toastr.error('Thông tin đăng nhập không hợp lệ');
        }
      );
    }
  }
}
