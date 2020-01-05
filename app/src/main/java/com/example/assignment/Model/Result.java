package com.example.assignment.Model;

public class Result  {
    private String name;

    private String rating;

    private String formatted_phone_number;

    //private Opening_hours place_open_hour;

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getRating ()
    {
        return rating;
    }

    public void setRating (String rating)
    {
        this.rating = rating;
    }

    public String getFormatted_phone_number ()
    {
        return formatted_phone_number;
    }

    public void setFormatted_phone_number (String formatted_phone_number)
    {
        this.formatted_phone_number = formatted_phone_number;
    }

    /*public Opening_hours getOpening_hours() {
        return opening_hours;
    }

    public void setOpening_hours(Opening_hours opening_hours) {
        this.opening_hours = opening_hours;
    }*/

    @Override
    public String toString()
    {
        return "ClassPojo [name = "+name+", rating = "+rating+", formatted_phone_number = "+formatted_phone_number+"]";
    }
}
