package com.codegym.service;

import com.codegym.model.Mail;

import java.util.ArrayList;
import java.util.List;

public class MailService implements IMailService {
    List<Mail> mailList = new ArrayList<>();

    @Override
    public List<Mail> findAll() {
        return mailList;
    }

    @Override
    public void save(Mail mail) {
        mailList.add(mail);
    }

    @Override
    public Mail findById(int id) {
        return mailList.get(id);
    }
}
