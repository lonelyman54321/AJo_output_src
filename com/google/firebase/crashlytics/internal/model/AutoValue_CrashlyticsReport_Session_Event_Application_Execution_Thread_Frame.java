/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame$1;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame;

final class AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame
extends CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame {
    private final String file;
    private final int importance;
    private final long offset;
    private final long pc;
    private final String symbol;

    private AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame(long l2, String string2, String string3, long l3, int n3) {
        this.pc = l2;
        this.symbol = string2;
        this.file = string3;
        this.offset = l3;
        this.importance = n3;
    }

    public /* synthetic */ AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame(long l2, String string2, String string3, long l3, int n3, AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame$1 autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame$1) {
        this(l2, string2, string3, l3, n3);
    }

    public boolean equals(Object object) {
        block4: {
            boolean bl2;
            block6: {
                block5: {
                    int n3;
                    String string2;
                    String string3;
                    bl2 = true;
                    if (object == this) {
                        return bl2;
                    }
                    Object object2 = object instanceof CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame;
                    if (object2 == 0) break block4;
                    long l2 = this.pc;
                    long l3 = ((CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame)(object = (CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame)object)).getPc();
                    long l4 = l2 - l3;
                    object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                    if (object2 != 0 || (object2 = (string3 = this.symbol).equals(string2 = ((CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame)object).getSymbol())) == 0 || !((string3 = this.file) == null ? (string3 = ((CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame)object).getFile()) == null : (object2 = string3.equals(string2 = ((CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame)object).getFile())) != 0)) break block5;
                    l2 = this.offset;
                    l3 = ((CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame)object).getOffset();
                    object2 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                    if (object2 == 0 && (object2 = this.importance) == (n3 = ((CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame)object).getImportance())) break block6;
                }
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public String getFile() {
        return this.file;
    }

    public int getImportance() {
        return this.importance;
    }

    public long getOffset() {
        return this.offset;
    }

    public long getPc() {
        return this.pc;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        long l2 = this.pc;
        int n3 = 32;
        long l3 = l2 >>> n3;
        int n4 = (int)(l2 ^= l3);
        int n7 = 1000003;
        n4 = (n4 ^ n7) * n7;
        int n8 = this.symbol.hashCode();
        n4 = (n4 ^ n8) * n7;
        String string2 = this.file;
        if (string2 == null) {
            n8 = 0;
            string2 = null;
        } else {
            n8 = string2.hashCode();
        }
        n4 = (n4 ^ n8) * n7;
        l3 = this.offset;
        n8 = (int)(l3 >>> n3 ^ l3);
        n4 = (n4 ^ n8) * n7;
        return this.importance ^ n4;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Frame{pc=");
        long l2 = this.pc;
        stringBuilder.append(l2);
        stringBuilder.append(", symbol=");
        String string2 = this.symbol;
        stringBuilder.append(string2);
        stringBuilder.append(", file=");
        string2 = this.file;
        stringBuilder.append(string2);
        stringBuilder.append(", offset=");
        l2 = this.offset;
        stringBuilder.append(l2);
        stringBuilder.append(", importance=");
        return g30.a(this.importance, "}", stringBuilder);
    }
}

