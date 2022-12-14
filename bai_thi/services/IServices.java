package projectmodule2.bai_thi.services;

import projectmodule2.bai_thi.exception.NotFoundException;

public interface IServices {
    void them();
    void xoa() throws NotFoundException;
    void timKiem() throws NotFoundException;
    void hienThi();

    
}
