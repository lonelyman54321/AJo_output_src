/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame$Builder;

final class AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame$Builder
extends CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame$Builder {
    private String file;
    private int importance;
    private long offset;
    private long pc;
    private byte set$0;
    private String symbol;

    public CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame build() {
        Object object;
        String string2;
        int n3 = this.set$0;
        int n4 = 7;
        if (n3 == n4 && (string2 = this.symbol) != null) {
            long l2 = this.pc;
            String string3 = this.file;
            long l3 = this.offset;
            int n7 = this.importance;
            AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame = new AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame(l2, string2, string3, l3, n7, null);
            return autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame;
        }
        CharSequence charSequence = new StringBuilder();
        n4 = this.set$0 & 1;
        if (n4 == 0) {
            object = " pc";
            charSequence.append((String)object);
        }
        if ((object = this.symbol) == null) {
            object = " symbol";
            charSequence.append((String)object);
        }
        if ((n4 = this.set$0 & 2) == 0) {
            object = " offset";
            charSequence.append((String)object);
        }
        if ((n4 = this.set$0 & 4) == 0) {
            object = " importance";
            charSequence.append((String)object);
        }
        charSequence = Gs.a("Missing required properties:", charSequence);
        object = new IllegalStateException((String)charSequence);
        throw object;
    }

    public CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame$Builder setFile(String string2) {
        this.file = string2;
        return this;
    }

    public CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame$Builder setImportance(int n3) {
        this.importance = n3;
        n3 = (byte)(this.set$0 | 4);
        this.set$0 = (byte)n3;
        return this;
    }

    public CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame$Builder setOffset(long l2) {
        byte by2;
        this.offset = l2;
        this.set$0 = by2 = (byte)(this.set$0 | 2);
        return this;
    }

    public CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame$Builder setPc(long l2) {
        byte by2;
        this.pc = l2;
        this.set$0 = by2 = (byte)(this.set$0 | 1);
        return this;
    }

    public CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame$Builder setSymbol(String object) {
        if (object != null) {
            this.symbol = object;
            return this;
        }
        object = new NullPointerException("Null symbol");
        throw object;
    }
}

