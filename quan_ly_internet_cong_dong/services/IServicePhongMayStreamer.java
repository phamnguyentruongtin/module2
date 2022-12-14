package projectmodule2.quan_ly_internet_cong_dong.services;

import projectmodule2.quan_ly_internet_cong_dong.exception.NotFoundException;

public interface IServicePhongMayStreamer {
    void addStream() throws NotFoundException;
    void searchStream() throws NotFoundException;
    void displayStream() throws NotFoundException;
    void removeStream() throws NotFoundException;
}
