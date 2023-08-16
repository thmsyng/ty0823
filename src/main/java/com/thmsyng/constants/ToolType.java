package com.thmsyng.constants;

public enum ToolType {
    LADDER ("Ladder", 1.99, true, true, false),
    CHAINSAW ("Chainsaw", 1.49, true, false, true),
    JACKHAMMER ("Jackhammer", 2.99, true, false, false);

    private final String toolName;
    private final double toolPrice;
    private final boolean weekdayCharge;
    private final boolean weekendCharge;
    private final boolean holidayCharge;

    ToolType(String toolName, double toolPrice, boolean weekdayCharge, boolean weekendCharge, boolean holidayCharge){
        this.toolName = toolName;
        this.toolPrice = toolPrice;
        this.weekdayCharge = weekdayCharge;
        this.weekendCharge = weekendCharge;
        this.holidayCharge = holidayCharge;
    }

    public String getToolName() {
        return toolName;
    }

    public double getToolPrice() {
        return toolPrice;
    }

    public boolean isWeekdayCharge() {
        return weekdayCharge;
    }

    public boolean isWeekendCharge() {
        return weekendCharge;
    }

    public boolean isHolidayCharge() {
        return holidayCharge;
    }
}
