package com.symagic.mail.repostory;

import com.symagic.mail.model.MallUsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MallUsersRepository extends JpaRepository<MallUsersEntity,Integer> {

    MallUsersEntity findByToken(String openId);

}
