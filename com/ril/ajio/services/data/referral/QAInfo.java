/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.referral;

import kotlin.jvm.internal.Intrinsics;

public final class QAInfo {
    private String answer;
    private String question;

    public QAInfo(String string2, String string3) {
        this.answer = string2;
        this.question = string3;
    }

    public static /* synthetic */ QAInfo copy$default(QAInfo qAInfo, String string2, String string3, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = qAInfo.answer;
        }
        if ((n3 &= 2) != 0) {
            string3 = qAInfo.question;
        }
        return qAInfo.copy(string2, string3);
    }

    public final String component1() {
        return this.answer;
    }

    public final String component2() {
        return this.question;
    }

    public final QAInfo copy(String string2, String string3) {
        QAInfo qAInfo = new QAInfo(string2, string3);
        return qAInfo;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof QAInfo;
        if (!bl3) {
            return false;
        }
        object = (QAInfo)object;
        String string2 = this.answer;
        String string3 = ((QAInfo)object).answer;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.question;
        object = ((QAInfo)object).question;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getAnswer() {
        return this.answer;
    }

    public final String getQuestion() {
        return this.question;
    }

    public int hashCode() {
        int n3;
        String string2 = this.answer;
        int n4 = 0;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n3 *= 31;
        String string3 = this.question;
        if (string3 != null) {
            n4 = string3.hashCode();
        }
        return n3 + n4;
    }

    public final void setAnswer(String string2) {
        this.answer = string2;
    }

    public final void setQuestion(String string2) {
        this.question = string2;
    }

    public String toString() {
        String string2 = this.answer;
        String string3 = this.question;
        return uc0_0.a("QAInfo(answer=", string2, ", question=", string3, ")");
    }
}

