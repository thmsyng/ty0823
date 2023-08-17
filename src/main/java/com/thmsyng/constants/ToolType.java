package com.thmsyng.constants;

public enum ToolType {
    LADDER (1.99, true, true, false),
    CHAINSAW (1.49, true, false, true),
    JACKHAMMER (2.99, true, false, false);

    private final double toolPrice;
    private final boolean weekdayCharge;
    private final boolean weekendCharge;
    private final boolean holidayCharge;

    ToolType(double toolPrice, boolean weekdayCharge, boolean weekendCharge, boolean holidayCharge){
        this.toolPrice = toolPrice;
        this.weekdayCharge = weekdayCharge;
        this.weekendCharge = weekendCharge;
        this.holidayCharge = holidayCharge;
    }

    public double getToolPrice() {
        return toolPrice;
    }

    public boolean hasWeekdayCharge() {
        return weekdayCharge;
    }

    public boolean hasWeekendCharge() {
        return weekendCharge;
    }

    public boolean hasHolidayCharge() {
        return holidayCharge;
    }
}
