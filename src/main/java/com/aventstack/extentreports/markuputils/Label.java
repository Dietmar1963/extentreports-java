package com.aventstack.extentreports.markuputils;

class Label implements Markup {

    private static final long serialVersionUID = 548763908072445261L;
    
    private String text = "";
    private ExtentColor color = ExtentColor.TRANSPARENT;
    
    public void setText(String text) {
        this.text = text;
    }
    public String getText() { return text; }
    
    public void setColor(ExtentColor color) { 
        this.color = color; 
    }
    public ExtentColor getColor() { return color; }

    public String getMarkup() {
        String textColor = color != ExtentColor.WHITE ? "white-text" : "black-text";
        String lhs = "<span class='badge " + textColor + " " + String.valueOf(color).toLowerCase() + "'>";
        String rhs = "</span>";
        
        return lhs + text + rhs;
    }
}
