package projectmodule2.quan_ly_internet_cong_dong.services;

import projectmodule2.quan_ly_internet_cong_dong.exception.NotFoundException;

public interface IServicePhongMayCouple {
    void addCouple() throws NotFoundException;
    void searchCouple() throws NotFoundException;
    void removeCouple() throws NotFoundException;
    void displayCoupleList() throws NotFoundException;
}
