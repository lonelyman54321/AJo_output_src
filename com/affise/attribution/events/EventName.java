/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.events;

import com.affise.attribution.events.EventName$Companion;

public final class EventName
extends Enum {
    private static final /* synthetic */ EventName[] $VALUES;
    public static final /* enum */ EventName ACHIEVE_LEVEL;
    public static final /* enum */ EventName ADD_PAYMENT_INFO;
    public static final /* enum */ EventName ADD_TO_CART;
    public static final /* enum */ EventName ADD_TO_WISHLIST;
    public static final /* enum */ EventName AD_REVENUE;
    public static final /* enum */ EventName CLICK_ADV;
    public static final /* enum */ EventName COMPLETE_REGISTRATION;
    public static final /* enum */ EventName COMPLETE_STREAM;
    public static final /* enum */ EventName COMPLETE_TRIAL;
    public static final /* enum */ EventName COMPLETE_TUTORIAL;
    public static final /* enum */ EventName CONTACT;
    public static final /* enum */ EventName CONTENT_ITEMS_VIEW;
    public static final /* enum */ EventName CUSTOMIZE_PRODUCT;
    public static final /* enum */ EventName CUSTOM_ID_01;
    public static final /* enum */ EventName CUSTOM_ID_02;
    public static final /* enum */ EventName CUSTOM_ID_03;
    public static final /* enum */ EventName CUSTOM_ID_04;
    public static final /* enum */ EventName CUSTOM_ID_05;
    public static final /* enum */ EventName CUSTOM_ID_06;
    public static final /* enum */ EventName CUSTOM_ID_07;
    public static final /* enum */ EventName CUSTOM_ID_08;
    public static final /* enum */ EventName CUSTOM_ID_09;
    public static final /* enum */ EventName CUSTOM_ID_10;
    public static final EventName$Companion Companion;
    public static final /* enum */ EventName DEEP_LINKED;
    public static final /* enum */ EventName DONATE;
    public static final /* enum */ EventName FAILED_PURCHASE;
    public static final /* enum */ EventName FIND_LOCATION;
    public static final /* enum */ EventName INITIATE_CHECKOUT;
    public static final /* enum */ EventName INITIATE_PURCHASE;
    public static final /* enum */ EventName INITIATE_STREAM;
    public static final /* enum */ EventName INVITE;
    public static final /* enum */ EventName LAST_ATTRIBUTED_TOUCH;
    public static final /* enum */ EventName LEAD;
    public static final /* enum */ EventName LIST_VIEW;
    public static final /* enum */ EventName LOGIN;
    public static final /* enum */ EventName OPENED_FROM_PUSH_NOTIFICATION;
    public static final /* enum */ EventName ORDER;
    public static final /* enum */ EventName ORDER_CANCEL;
    public static final /* enum */ EventName ORDER_ITEM_ADDED;
    public static final /* enum */ EventName ORDER_ITEM_REMOVE;
    public static final /* enum */ EventName ORDER_RETURN_REQUEST;
    public static final /* enum */ EventName ORDER_RETURN_REQUEST_CANCEL;
    public static final /* enum */ EventName PURCHASE;
    public static final /* enum */ EventName RATE;
    public static final /* enum */ EventName RESERVE;
    public static final /* enum */ EventName RE_ENGAGE;
    public static final /* enum */ EventName SALES;
    public static final /* enum */ EventName SCHEDULE;
    public static final /* enum */ EventName SEARCH;
    public static final /* enum */ EventName SHARE;
    public static final /* enum */ EventName SPEND_CREDITS;
    public static final /* enum */ EventName START_REGISTRATION;
    public static final /* enum */ EventName START_TRIAL;
    public static final /* enum */ EventName START_TUTORIAL;
    public static final /* enum */ EventName SUBMIT_APPLICATION;
    public static final /* enum */ EventName SUBSCRIBE;
    public static final /* enum */ EventName TRAVEL_BOOKING;
    public static final /* enum */ EventName UNLOCK_ACHIEVEMENT;
    public static final /* enum */ EventName UNSUBSCRIBE;
    public static final /* enum */ EventName UPDATE;
    public static final /* enum */ EventName VIEW_ADV;
    public static final /* enum */ EventName VIEW_CART;
    public static final /* enum */ EventName VIEW_CONTENT;
    public static final /* enum */ EventName VIEW_ITEM;
    public static final /* enum */ EventName VIEW_ITEMS;
    private final String eventName;

    private static final /* synthetic */ EventName[] $values() {
        EventName eventName = ACHIEVE_LEVEL;
        eventName = ADD_PAYMENT_INFO;
        eventName = ADD_TO_CART;
        eventName = ADD_TO_WISHLIST;
        eventName = AD_REVENUE;
        eventName = CLICK_ADV;
        eventName = COMPLETE_REGISTRATION;
        eventName = COMPLETE_STREAM;
        eventName = COMPLETE_TRIAL;
        eventName = COMPLETE_TUTORIAL;
        eventName = CONTACT;
        eventName = CONTENT_ITEMS_VIEW;
        eventName = CUSTOM_ID_01;
        eventName = CUSTOM_ID_02;
        eventName = CUSTOM_ID_03;
        eventName = CUSTOM_ID_04;
        eventName = CUSTOM_ID_05;
        eventName = CUSTOM_ID_06;
        eventName = CUSTOM_ID_07;
        eventName = CUSTOM_ID_08;
        eventName = CUSTOM_ID_09;
        eventName = CUSTOM_ID_10;
        eventName = CUSTOMIZE_PRODUCT;
        eventName = DEEP_LINKED;
        eventName = DONATE;
        eventName = FIND_LOCATION;
        eventName = INITIATE_CHECKOUT;
        eventName = INITIATE_PURCHASE;
        eventName = INITIATE_STREAM;
        eventName = INVITE;
        eventName = LAST_ATTRIBUTED_TOUCH;
        eventName = LEAD;
        eventName = LIST_VIEW;
        eventName = LOGIN;
        eventName = OPENED_FROM_PUSH_NOTIFICATION;
        eventName = ORDER;
        eventName = ORDER_ITEM_ADDED;
        eventName = ORDER_ITEM_REMOVE;
        eventName = ORDER_CANCEL;
        eventName = ORDER_RETURN_REQUEST;
        eventName = ORDER_RETURN_REQUEST_CANCEL;
        eventName = PURCHASE;
        eventName = FAILED_PURCHASE;
        eventName = RATE;
        eventName = RE_ENGAGE;
        eventName = RESERVE;
        eventName = SALES;
        eventName = SCHEDULE;
        eventName = SEARCH;
        eventName = SHARE;
        eventName = SPEND_CREDITS;
        eventName = START_REGISTRATION;
        eventName = START_TRIAL;
        eventName = START_TUTORIAL;
        eventName = SUBMIT_APPLICATION;
        eventName = SUBSCRIBE;
        eventName = TRAVEL_BOOKING;
        eventName = UNLOCK_ACHIEVEMENT;
        eventName = UNSUBSCRIBE;
        eventName = UPDATE;
        eventName = VIEW_ADV;
        eventName = VIEW_CART;
        eventName = VIEW_CONTENT;
        eventName = VIEW_ITEM;
        eventName = VIEW_ITEMS;
        EventName[] eventNameArray = new EventName[]{eventName, eventName, eventName, eventName, eventName, eventName, eventName, eventName, eventName, eventName, eventName, eventName, eventName, eventName, eventName, eventName, eventName, eventName, eventName, eventName, eventName, eventName, eventName, eventName, eventName, eventName, eventName, eventName, eventName, eventName, eventName, eventName, eventName, eventName, eventName, eventName, eventName, eventName, eventName, eventName, eventName, eventName, eventName, eventName, eventName, eventName, eventName, eventName, eventName, eventName, eventName, eventName, eventName, eventName, eventName, eventName, eventName, eventName, eventName, eventName, eventName, eventName, eventName, eventName, eventName};
        return eventNameArray;
    }

    static {
        Object object;
        ACHIEVE_LEVEL = object = new EventName("ACHIEVE_LEVEL", 0, "AchieveLevel");
        ADD_PAYMENT_INFO = object = new EventName("ADD_PAYMENT_INFO", 1, "AddPaymentInfo");
        ADD_TO_CART = object = new EventName("ADD_TO_CART", 2, "AddToCart");
        ADD_TO_WISHLIST = object = new EventName("ADD_TO_WISHLIST", 3, "AddToWishlist");
        AD_REVENUE = object = new EventName("AD_REVENUE", 4, "AdRevenue");
        CLICK_ADV = object = new EventName("CLICK_ADV", 5, "ClickAdv");
        COMPLETE_REGISTRATION = object = new EventName("COMPLETE_REGISTRATION", 6, "CompleteRegistration");
        COMPLETE_STREAM = object = new EventName("COMPLETE_STREAM", 7, "CompleteStream");
        COMPLETE_TRIAL = object = new EventName("COMPLETE_TRIAL", 8, "CompleteTrial");
        COMPLETE_TUTORIAL = object = new EventName("COMPLETE_TUTORIAL", 9, "CompleteTutorial");
        CONTACT = object = new EventName("CONTACT", 10, "Contact");
        CONTENT_ITEMS_VIEW = object = new EventName("CONTENT_ITEMS_VIEW", 11, "ContentItemsView");
        CUSTOM_ID_01 = object = new EventName("CUSTOM_ID_01", 12, "CustomId01");
        CUSTOM_ID_02 = object = new EventName("CUSTOM_ID_02", 13, "CustomId02");
        CUSTOM_ID_03 = object = new EventName("CUSTOM_ID_03", 14, "CustomId03");
        CUSTOM_ID_04 = object = new EventName("CUSTOM_ID_04", 15, "CustomId04");
        CUSTOM_ID_05 = object = new EventName("CUSTOM_ID_05", 16, "CustomId05");
        CUSTOM_ID_06 = object = new EventName("CUSTOM_ID_06", 17, "CustomId06");
        CUSTOM_ID_07 = object = new EventName("CUSTOM_ID_07", 18, "CustomId07");
        CUSTOM_ID_08 = object = new EventName("CUSTOM_ID_08", 19, "CustomId08");
        CUSTOM_ID_09 = object = new EventName("CUSTOM_ID_09", 20, "CustomId09");
        CUSTOM_ID_10 = object = new EventName("CUSTOM_ID_10", 21, "CustomId10");
        CUSTOMIZE_PRODUCT = object = new EventName("CUSTOMIZE_PRODUCT", 22, "CustomizeProduct");
        DEEP_LINKED = object = new EventName("DEEP_LINKED", 23, "DeepLinked");
        DONATE = object = new EventName("DONATE", 24, "Donate");
        FIND_LOCATION = object = new EventName("FIND_LOCATION", 25, "FindLocation");
        INITIATE_CHECKOUT = object = new EventName("INITIATE_CHECKOUT", 26, "InitiateCheckout");
        INITIATE_PURCHASE = object = new EventName("INITIATE_PURCHASE", 27, "InitiatePurchase");
        INITIATE_STREAM = object = new EventName("INITIATE_STREAM", 28, "InitiateStream");
        INVITE = object = new EventName("INVITE", 29, "Invite");
        LAST_ATTRIBUTED_TOUCH = object = new EventName("LAST_ATTRIBUTED_TOUCH", 30, "LastAttributedTouch");
        LEAD = object = new EventName("LEAD", 31, "Lead");
        LIST_VIEW = object = new EventName("LIST_VIEW", 32, "ListView");
        LOGIN = object = new EventName("LOGIN", 33, "Login");
        OPENED_FROM_PUSH_NOTIFICATION = object = new EventName("OPENED_FROM_PUSH_NOTIFICATION", 34, "OpenedFromPushNotification");
        ORDER = object = new EventName("ORDER", 35, "Order");
        ORDER_ITEM_ADDED = object = new EventName("ORDER_ITEM_ADDED", 36, "OrderItemAdded");
        ORDER_ITEM_REMOVE = object = new EventName("ORDER_ITEM_REMOVE", 37, "OrderItemRemove");
        ORDER_CANCEL = object = new EventName("ORDER_CANCEL", 38, "OrderCancel");
        ORDER_RETURN_REQUEST = object = new EventName("ORDER_RETURN_REQUEST", 39, "OrderReturnRequest");
        ORDER_RETURN_REQUEST_CANCEL = object = new EventName("ORDER_RETURN_REQUEST_CANCEL", 40, "OrderReturnRequestCancel");
        PURCHASE = object = new EventName("PURCHASE", 41, "Purchase");
        FAILED_PURCHASE = object = new EventName("FAILED_PURCHASE", 42, "FailedPurchase");
        RATE = object = new EventName("RATE", 43, "Rate");
        RE_ENGAGE = object = new EventName("RE_ENGAGE", 44, "ReEngage");
        RESERVE = object = new EventName("RESERVE", 45, "Reserve");
        SALES = object = new EventName("SALES", 46, "Sales");
        SCHEDULE = object = new EventName("SCHEDULE", 47, "Schedule");
        SEARCH = object = new EventName("SEARCH", 48, "Search");
        SHARE = object = new EventName("SHARE", 49, "Share");
        SPEND_CREDITS = object = new EventName("SPEND_CREDITS", 50, "SpendCredits");
        START_REGISTRATION = object = new EventName("START_REGISTRATION", 51, "StartRegistration");
        START_TRIAL = object = new EventName("START_TRIAL", 52, "StartTrial");
        START_TUTORIAL = object = new EventName("START_TUTORIAL", 53, "StartTutorial");
        SUBMIT_APPLICATION = object = new EventName("SUBMIT_APPLICATION", 54, "SubmitApplication");
        SUBSCRIBE = object = new EventName("SUBSCRIBE", 55, "Subscribe");
        TRAVEL_BOOKING = object = new EventName("TRAVEL_BOOKING", 56, "TravelBooking");
        UNLOCK_ACHIEVEMENT = object = new EventName("UNLOCK_ACHIEVEMENT", 57, "UnlockAchievement");
        UNSUBSCRIBE = object = new EventName("UNSUBSCRIBE", 58, "Unsubscribe");
        UPDATE = object = new EventName("UPDATE", 59, "Update");
        VIEW_ADV = object = new EventName("VIEW_ADV", 60, "ViewAdv");
        VIEW_CART = object = new EventName("VIEW_CART", 61, "ViewCart");
        VIEW_CONTENT = object = new EventName("VIEW_CONTENT", 62, "ViewContent");
        VIEW_ITEM = object = new EventName("VIEW_ITEM", 63, "ViewItem");
        VIEW_ITEMS = object = new EventName("VIEW_ITEMS", 64, "ViewItems");
        $VALUES = EventName.$values();
        object = new EventName$Companion(null);
        Companion = object;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private EventName() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.eventName = var3_2;
    }

    public static final EventName from(String string2) {
        return Companion.from(string2);
    }

    public static EventName valueOf(String string2) {
        return Enum.valueOf(EventName.class, string2);
    }

    public static EventName[] values() {
        return (EventName[])$VALUES.clone();
    }

    public final String getEventName() {
        return this.eventName;
    }
}

