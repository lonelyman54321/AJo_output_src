/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.affise.attribution.events;

import com.affise.attribution.events.Event;
import com.affise.attribution.events.IsFirstForUserUseCase;
import com.affise.attribution.events.subscription.BaseSubscriptionEvent;
import com.affise.attribution.storages.IsFirstForUserStorage;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;
import org.json.JSONObject;

public final class IsFirstForUserUseCaseImpl
implements IsFirstForUserUseCase {
    private List cache;
    private final IsFirstForUserStorage isFirstForUserStorage;

    public IsFirstForUserUseCaseImpl(IsFirstForUserStorage object) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(object, "isFirstForUserStorage");
        this.isFirstForUserStorage = object;
        this.cache = arrayList = new ArrayList();
        this.cache = object = CollectionsKt.m0(object.getEventsNames());
    }

    public void updateEvent(Event event) {
        Object object = "event";
        Intrinsics.checkNotNullParameter(event, (String)object);
        boolean bl2 = event instanceof BaseSubscriptionEvent;
        if (bl2) {
            object = event;
            object = ((BaseSubscriptionEvent)event).getSubtype();
        } else {
            object = event.getName();
        }
        Object object2 = this.cache;
        boolean bl3 = object2.contains(object);
        if (bl3) {
            bl2 = false;
            object = null;
            event.setFirstForUser$attribution_release(false);
        } else {
            this.cache.add(object);
            object2 = this.isFirstForUserStorage;
            object2.add((String)object);
            bl2 = true;
            event.setFirstForUser$attribution_release(bl2);
        }
    }

    public String updateWebEvent(String object) {
        boolean bl2;
        String string2;
        String string3 = "event";
        Intrinsics.checkNotNullParameter(object, string3);
        try {
            string3 = new JSONObject((String)object);
        }
        catch (Exception exception) {
            string3 = new JSONObject();
        }
        Object object2 = string3.optJSONObject("affise_event_data");
        if (object2 != null) {
            string2 = "affise_event_type";
            object2 = object2.optString(string2);
        } else {
            object2 = null;
        }
        if (object2 == null || (bl2 = b.k((CharSequence)object2))) {
            object2 = string3.optString("affise_event_name");
        }
        if (object2 == null) {
            return object;
        }
        object = this.cache;
        boolean bl3 = object.contains(object2);
        string2 = "affise_event_first_for_user";
        if (bl3) {
            object = Boolean.FALSE;
            string3.putOpt(string2, object);
        } else {
            this.cache.add(object2);
            this.isFirstForUserStorage.add((String)object2);
            object = Boolean.TRUE;
            string3.putOpt(string2, object);
        }
        object = string3.toString();
        Intrinsics.checkNotNullExpressionValue(object, "eventJson.toString()");
        return object;
    }
}

