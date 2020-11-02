package com.pinkong.service.impl;

import com.pinkong.mapper.OmsCompanyAddressMapper;
import com.pinkong.model.OmsCompanyAddress;
import com.pinkong.model.OmsCompanyAddressExample;
import com.pinkong.service.OmsCompanyAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 收货地址管理Service实现类
 * Created by pinkong on 2018/10/18.
 */
@Service
public class OmsCompanyAddressServiceImpl implements OmsCompanyAddressService {
    @Autowired
    private OmsCompanyAddressMapper companyAddressMapper;
    @Override
    public List<OmsCompanyAddress> list() {
        return companyAddressMapper.selectByExample(new OmsCompanyAddressExample());
    }
}
