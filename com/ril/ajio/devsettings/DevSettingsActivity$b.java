/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.ril.ajio.devsettings;

import com.ril.ajio.services.data.user.UserInformation;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

public final class DevSettingsActivity$b
extends qg3_2
implements Function2 {
    public DevSettingsActivity$b() {
        throw null;
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        object = new qg3_2(2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (DevSettingsActivity$b)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((DevSettingsActivity$b)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = w61_0.a;
        object = new JSONObject();
        object2 = ch_2.f;
        object.put("pageId", object2);
        object2 = ch_2.g;
        object.put("pageUrl", object2);
        object2 = ch_2.l;
        object.put("selectedStore", object2);
        object2 = ch_2.n;
        object.put("shouldCallJioAds", object2);
        object2 = ch_2.h;
        object.put("userType", object2);
        object2 = ch_2.j;
        object.put("userGroup", object2);
        object2 = ch_2.m;
        object.put("userSubGroup", object2);
        object2 = ch_2.i;
        object.put("userStatus", object2);
        object2 = ch_2.k;
        object.put("appVersion", object2);
        object2 = ch_2.e;
        object.put("year", object2);
        object2 = ch_2.d;
        object.put("month", object2);
        object2 = ch_2.c;
        object.put("dayOfMonth", object2);
        object2 = ch_2.b;
        object.put("hourOfDay", object2);
        object2 = ch_2.a;
        object.put("minute", object2);
        boolean bl2 = ch_2.o;
        object2 = bl2;
        String string2 = "isUAT";
        object.put(string2, object2);
        object2 = w61_0.b;
        if (object2 != null) {
            object = object.toString();
            ((UserInformation)object2).setCmsPreviewInfo((String)object);
        }
        return Unit.a;
    }
}

