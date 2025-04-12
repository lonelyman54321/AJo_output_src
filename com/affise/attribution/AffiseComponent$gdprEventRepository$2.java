/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 */
package com.affise.attribution;

import android.content.SharedPreferences;
import com.affise.attribution.AffiseComponent;
import com.affise.attribution.converter.Converter;
import com.affise.attribution.events.GDPREventRepository;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class AffiseComponent$gdprEventRepository$2
extends Lambda
implements Function0 {
    final /* synthetic */ AffiseComponent this$0;

    public AffiseComponent$gdprEventRepository$2(AffiseComponent affiseComponent) {
        this.this$0 = affiseComponent;
        super(0);
    }

    public final GDPREventRepository invoke() {
        SharedPreferences sharedPreferences2 = this.this$0.getSharedPreferences();
        Converter converter = AffiseComponent.access$getEventToSerializedEventConverter(this.this$0);
        GDPREventRepository gDPREventRepository = new GDPREventRepository(sharedPreferences2, converter);
        return gDPREventRepository;
    }
}

