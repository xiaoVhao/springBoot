package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Administrator on 2017/3/18.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class JavaMailTest {
    @Autowired
    private JavaMailSender mailSender;
    @Test
    public void sendSimpleMail() throws Exception {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("994709373@qq.com");
        message.setTo("994709373@qq.com");
        message.setSubject("主题：录用通知书");
        message.setText("你被腾讯录用了");
        mailSender.send(message);

        /**
         * MimeMessage mimeMessage = mailSender.createMimeMessage();
         MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
         helper.setFrom("dyc87112@qq.com");
         helper.setTo("dyc87112@qq.com");
         helper.setSubject("主题：有附件");
         helper.setText("有附件的邮件");
         FileSystemResource file = new FileSystemResource(new File("weixin.jpg"));
         helper.addAttachment("附件-1.jpg", file);
         helper.addAttachment("附件-2.jpg", file);
         mailSender.send(mimeMessage);



         MimeMessage mimeMessage = mailSender.createMimeMessage();
         MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
         helper.setFrom("dyc87112@qq.com");
         helper.setTo("dyc87112@qq.com");
         helper.setSubject("主题：嵌入静态资源");
         helper.setText("<html><body><img src=\"cid:weixin\" ></body></html>", true);
         FileSystemResource file = new FileSystemResource(new File("weixin.jpg"));
         helper.addInline("weixin", file);
         mailSender.send(mimeMessage);
         */

    }
}
