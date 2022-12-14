package projectmodule2.quan_ly_internet_cong_dong.services;

import projectmodule2.quan_ly_internet_cong_dong.exception.NotFoundException;

public interface IServicesPhongMayThuong {
    void addNormal() throws NotFoundException;
    void searchNormal() throws NotFoundException;
    void displayNormal() throws NotFoundException;
    void removeNormal() throws NotFoundException;
}
