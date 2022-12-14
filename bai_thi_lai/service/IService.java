package projectmodule2.bai_thi_lai.service;

import projectmodule2.bai_thi_lai.exception.NotFoundException;

public interface IService {
    void them();
    void xoa() throws NotFoundException;
    void hienThi();
}
