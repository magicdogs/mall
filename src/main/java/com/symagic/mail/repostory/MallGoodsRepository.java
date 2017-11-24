package com.symagic.mail.repostory;

import com.symagic.mail.model.MallGoodsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MallGoodsRepository extends JpaRepository<MallGoodsEntity,Integer> {

    List<MallGoodsEntity> findByCategoryId(int categoryId);

}
