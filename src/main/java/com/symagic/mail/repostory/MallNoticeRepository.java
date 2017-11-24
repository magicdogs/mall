package com.symagic.mail.repostory;

import com.symagic.mail.model.MallNoticeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MallNoticeRepository extends JpaRepository<MallNoticeEntity,Integer> {
}
