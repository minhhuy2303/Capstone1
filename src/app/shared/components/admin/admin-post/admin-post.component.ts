import { Component } from '@angular/core';
import { AngularEditorConfig } from '@kolkov/angular-editor';
import * as ClassicEditor from '@ckeditor/ckeditor5-build-classic';
import { ChangeEvent } from '@ckeditor/ckeditor5-angular/ckeditor.component';
@Component({
  selector: 'app-admin-post',
  templateUrl: './admin-post.component.html',
  styleUrls: ['./admin-post.component.css'],
})
export class AdminPostComponent {
  public Editor = ClassicEditor;
  showModal = false;
  showModalDelete = false;
  showModalEditPost = false;
  isPost: Boolean = true;
  showCreate() {
    this.isPost = false;
  }
  showManage() {
    this.isPost = true;
  }
  openEditPost() {
    this.showModalEditPost = true;
  }
  closeEditPost() {
    this.showModalEditPost = false;
  }
  openModalDelete() {
    this.showModalDelete = !this.showModalDelete;
  }
  closeModalDelete() {
    this.showModalDelete = false;
  }
}
