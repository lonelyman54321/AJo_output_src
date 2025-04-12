/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Order;

import java.io.Serializable;
import java.util.ArrayList;

public class Question
implements Serializable {
    public String category;
    public int questionId;
    public ArrayList responseOptions;
    public String target;
    public String title;
    public String type;
}

