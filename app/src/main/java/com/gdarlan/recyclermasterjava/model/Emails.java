package com.gdarlan.recyclermasterjava.model;

import java.util.Arrays;
import java.util.List;

public class Emails {
    public static List<Email> fakeEmails() {
        return Arrays.asList(
                Email.EmailBuilder.builder()
                        .setUser("Facebook")
                        .setSubject("Veja nossas tres dicas principais...")
                        .setPreview("Olá Darlan, você precisa ver esse site para")
                        .setDate("5 jun")
                        .build(),

                Email.EmailBuilder.builder()
                        .setUser("Facebook")
                        .setSubject("Um amigo quer que você curta uma Página dele")
                        .setPreview("Fulano convidou você para curtir....")
                        .setDate("30 mai")
                        .build(),

                Email.EmailBuilder.builder()
                        .setUser("Youtube")
                        .setSubject("Mussum Ipsum, cacilds vidis litro abertis. Interessantiss ")
                        .setPreview("Mussum Ipsum, cacilds vidis litro abertis. Interessantiss quisso pudia ce receita de bolis, mais bolis eu num gostis. ")
                        .setDate("30 mai")
                        .setStared(true)
                        .setUnread(true)
                        .build(),

                Email.EmailBuilder.builder()
                        .setUser("Youtube")
                        .setSubject("Mussum Ipsum, cacilds vidis litro abertis. Delegadis gente ")
                        .setPreview("Mussum Ipsum, cacilds vidis litro abertis. Delegadis gente finis, bibendum egestas augue arcu ut est. Interessantiss quisso pudia ce receita de bolis, mais bolis eu num gostis.")
                        .setDate("30 mai")
                        .setUnread(true)
                        .build(),
                Email.EmailBuilder.builder()
                        .setUser("Instagram")
                        .setSubject("Mussum Ipsum, cacilds vidis litro abertis. Delegadis gente ")
                        .setPreview("Mussum Ipsum, cacilds vidis litro abertis. Delegadis gente finis, bibendum egestas augue arcu ut est. Interessantiss quisso pudia ce receita de bolis, mais bolis eu num gostis.")
                        .setDate("30 mai")
                        .setUnread(true)
                        .build(), Email.EmailBuilder.builder()
                        .setUser("Instagram")
                        .setSubject("Mussum Ipsum, cacilds vidis litro abertis. Delegadis gente ")
                        .setPreview("Mussum Ipsum, cacilds vidis litro abertis. Delegadis gente finis, bibendum egestas augue arcu ut est. Interessantiss quisso pudia ce receita de bolis, mais bolis eu num gostis.")
                        .setDate("30 mai")
                        .setUnread(true)
                        .build(), Email.EmailBuilder.builder()
                        .setUser("Instagram")
                        .setSubject("Mussum Ipsum, cacilds vidis litro abertis. Delegadis gente ")
                        .setPreview("Mussum Ipsum, cacilds vidis litro abertis. Delegadis gente finis, bibendum egestas augue arcu ut est. Interessantiss quisso pudia ce receita de bolis, mais bolis eu num gostis.")
                        .setDate("30 mai")
                        .setUnread(true)
                        .build(), Email.EmailBuilder.builder()
                        .setUser("Instagram")
                        .setSubject("Mussum Ipsum, cacilds vidis litro abertis. Delegadis gente ")
                        .setPreview("Mussum Ipsum, cacilds vidis litro abertis. Delegadis gente finis, bibendum egestas augue arcu ut est. Interessantiss quisso pudia ce receita de bolis, mais bolis eu num gostis.")
                        .setDate("30 mai")
                        .setUnread(true)
                        .build(),
                Email.EmailBuilder.builder()
                        .setUser("Discord")
                        .setSubject("Mussum Ipsum, cacilds vidis litro abertis. Delegadis gente ")
                        .setPreview("Mussum Ipsum, cacilds vidis litro abertis. Delegadis gente finis, bibendum egestas augue arcu ut est. Interessantiss quisso pudia ce receita de bolis, mais bolis eu num gostis.")
                        .setDate("30 mai")
                        .setUnread(true)
                        .build(),
                Email.EmailBuilder.builder()
                        .setUser("Instagram")
                        .setSubject("Mussum Ipsum, cacilds vidis litro abertis. Delegadis gente ")
                        .setPreview("Mussum Ipsum, cacilds vidis litro abertis. Delegadis gente finis, bibendum egestas augue arcu ut est. Interessantiss quisso pudia ce receita de bolis, mais bolis eu num gostis.")
                        .setDate("30 mai")
                        .setUnread(true)
                        .build(),
                Email.EmailBuilder.builder()
                        .setUser("Discord")
                        .setSubject("Mussum Ipsum, cacilds vidis litro abertis. Delegadis gente ")
                        .setPreview("Mussum Ipsum, cacilds vidis litro abertis. Delegadis gente finis, bibendum egestas augue arcu ut est. Interessantiss quisso pudia ce receita de bolis, mais bolis eu num gostis.")
                        .setDate("30 mai")
                        .setUnread(true)
                        .build(),
                Email.EmailBuilder.builder()
                        .setUser("Youtube")
                        .setSubject("Mussum Ipsum, cacilds vidis litro abertis. Delegadis gente ")
                        .setPreview("Mussum Ipsum, cacilds vidis litro abertis. Delegadis gente finis, bibendum egestas augue arcu ut est. Interessantiss quisso pudia ce receita de bolis, mais bolis eu num gostis.")
                        .setDate("30 mai")
                        .setUnread(true)
                        .build()

        );
    }
}
