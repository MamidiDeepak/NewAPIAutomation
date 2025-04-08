package org.ShareAbleAPIAutomationFramework.pojo.response;

import org.ShareAbleAPIAutomationFramework.pojo.request.PostPojo;

public class Post_Response {

    private String bookingid;
    private PostPojo booking;

    public String getBookingid() {
        return bookingid;
    }

    public void setBookingid(String bookingid) {
        this.bookingid = bookingid;
    }

    public PostPojo getBooking() {
        return booking;
    }

    public void setBooking(PostPojo booking) {
        this.booking = booking;
    }
}
