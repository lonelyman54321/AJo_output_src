/*
 * Decompiled with CFR 0.152.
 */
package com.facebook;

import com.facebook.FacebookSdk;
import java.util.Random;

public class FacebookException
extends RuntimeException {
    public static final /* synthetic */ int a = 0;
    public static final long serialVersionUID = 1L;

    public FacebookException() {
    }

    public FacebookException(String string2) {
        super(string2);
        int n3;
        int n4;
        Object object = new Random();
        if (string2 != null && (n4 = FacebookSdk.isInitialized()) != 0 && (n3 = object.nextInt(100)) > (n4 = 50)) {
            object = kJ0$b.ErrorReport;
            az_0 az_02 = new az_0(string2);
            kj0_0.a(az_02, (kJ0$b)((Object)object));
        }
    }

    public String toString() {
        String string2 = this.getMessage();
        if (string2 == null) {
            string2 = "";
        }
        return string2;
    }
}

