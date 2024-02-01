package com.xcoder.lesson27

import static com.xcoder.lesson27.DslBuilder.*

//def email = new Email()
//email.setFrom("from@gmail.com")
//email.setTo("to@gmail.com")
//email.setTitle("title")
//def body = new EmailBody()
//body.setText("text")
//body.setImages(List.of())
//email.setBody(body)

mail {
    from "from@gmail.com"
    to "to@gmail.com"
    title "title"
    body {
        text "text of the letter"
        images(["image.jpg", "image2.png"])
    }
}

