function update(elm) {
    var texts = elm.getElementsByTagName("td");
    var userId = texts[0].innerHTML;
    var userName = texts[1].innerHTML;
    var comment = texts[2].innerHTML;
    location.href = "./userUpdate?userId=" + userId + "&userName=" + userName + "&comment=" + comment;
}