package DANHHT.Fashion.service.impl;

import DANHHT.Fashion.model.Brand;
import DANHHT.Fashion.repository.IBrandRepsitory;
import DANHHT.Fashion.service.BrandServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BrandServiceImpl implements BrandServie {
    @Autowired
    private IBrandRepsitory iBrandRepsitory;
    @Override
    public List<Brand> getAllBrand(){ return iBrandRepsitory.findAll();}
    @Override
    public void deleteBrandById(long id){  this.iBrandRepsitory.deleteById(id);

    }

    @Override
    public void saveBrand(Brand brand){
        this.iBrandRepsitory.save(brand);
    }
    @Override
    public Brand getBrandById(long id){
        Optional<Brand> optional = iBrandRepsitory.findById(id);
        if(optional.isPresent())
        {
            return optional.get();
        } else {
            throw new RuntimeException("Category not found for id " + id);
        }
    }
}
