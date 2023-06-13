package DANHHT.Fashion.service;

import DANHHT.Fashion.model.Brand;

import java.util.List;

public interface BrandServie {
    List<Brand> getAllBrand();
    void saveBrand(Brand brand);
    Brand getBrandById(long id);
    void deleteBrandById(long id);
}
