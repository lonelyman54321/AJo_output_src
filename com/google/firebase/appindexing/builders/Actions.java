/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.appindexing.builders;

import com.google.firebase.appindexing.Action;
import com.google.firebase.appindexing.Action$Builder;

public final class Actions {
    public static Action newView(String string2, String string3) {
        Action$Builder action$Builder = new Action$Builder("ViewAction");
        action$Builder.setObject(string2, string3);
        return action$Builder.build();
    }
}

