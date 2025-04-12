/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.model;

import com.ril.ajio.kmm.shared.model.ResponseStatusType;
import com.ril.ajio.kmm.shared.model.Status;
import com.ril.ajio.kmm.shared.model.Status$$serializer;
import com.ril.ajio.kmm.shared.model.StatusInfo$Companion;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

public abstract class StatusInfo {
    private static final rq1_2 $cachedSerializer$delegate;
    public static final StatusInfo$Companion Companion;
    private int httpStatusCode;
    private Status status;

    static {
        Object object;
        Companion = object = new StatusInfo$Companion(null);
        object = et1_2.PUBLICATION;
        La la = new La(2);
        $cachedSerializer$delegate = yr1_2.a((et1_2)((Object)object), la);
    }

    public StatusInfo() {
        this(null, 0, 3, null);
    }

    public /* synthetic */ StatusInfo(int n3, Status status, int n4, a03_0 a03_02) {
        int n7 = n3 & 1;
        if (n7 == 0) {
            status = null;
        }
        this.status = status;
        if ((n3 &= 2) == 0) {
            n3 = 0;
            this.httpStatusCode = 0;
        } else {
            this.httpStatusCode = n4;
        }
    }

    public StatusInfo(Status status, int n3) {
        this.status = status;
        this.httpStatusCode = n3;
    }

    public /* synthetic */ StatusInfo(Status status, int n3, int n4, DefaultConstructorMarker defaultConstructorMarker) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            status = null;
        }
        if ((n4 &= 2) != 0) {
            n3 = 0;
        }
        this(status, n3);
    }

    private static final KSerializer _init_$_anonymous_() {
        Object object = Reflection.getOrCreateKotlinClass(StatusInfo.class);
        Object[] objectArray = new Annotation[]{};
        Intrinsics.checkNotNullParameter(object, "baseClass");
        Intrinsics.checkNotNullParameter(objectArray, "classAnnotations");
        qw2_2 qw2_22 = new qw2_2((yn1_2)object);
        qw2_22.b = object = rp_1.e(objectArray);
        return qw2_22;
    }

    public static /* synthetic */ KSerializer a() {
        return StatusInfo._init_$_anonymous_();
    }

    public static final /* synthetic */ rq1_2 access$get$cachedSerializer$delegate$cp() {
        return $cachedSerializer$delegate;
    }

    public static final /* synthetic */ void write$Self(StatusInfo statusInfo, u30_0 u30_02, SerialDescriptor serialDescriptor) {
        Object object;
        int n3 = 0;
        int n4 = u30_02.I(serialDescriptor, 0);
        if (n4 != 0 || (object = statusInfo.status) != null) {
            object = Status$$serializer.INSTANCE;
            Status status = statusInfo.status;
            u30_02.r(serialDescriptor, 0, (b03_0)object, status);
        }
        if ((n4 = u30_02.I(serialDescriptor, n3 = 1)) != 0 || (n4 = statusInfo.httpStatusCode) != 0) {
            int n7 = statusInfo.httpStatusCode;
            u30_02.E(serialDescriptor, n3, n7);
        }
    }

    public final int getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final boolean isSuccess() {
        Object object = this.status;
        boolean bl2 = false;
        if (object != null) {
            int n3;
            ResponseStatusType responseStatusType = ResponseStatusType.API_SUCCESS;
            int n4 = responseStatusType.getType();
            if ((object = ((Status)object).getStatusCode()) != null && n4 == (n3 = ((Integer)object).intValue())) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public final void setHttpStatusCode(int n3) {
        this.httpStatusCode = n3;
    }

    public final void setStatus(Status status) {
        this.status = status;
    }
}

