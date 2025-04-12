/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.MoreObjects$1;
import com.google.common.base.MoreObjects$ToStringHelper$UnconditionalValueHolder;
import com.google.common.base.MoreObjects$ToStringHelper$ValueHolder;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

public final class MoreObjects$ToStringHelper {
    private final String className;
    private final MoreObjects$ToStringHelper$ValueHolder holderHead;
    private MoreObjects$ToStringHelper$ValueHolder holderTail;
    private boolean omitEmptyValues;
    private boolean omitNullValues;

    private MoreObjects$ToStringHelper(String string2) {
        MoreObjects$ToStringHelper$ValueHolder moreObjects$ToStringHelper$ValueHolder;
        this.holderHead = moreObjects$ToStringHelper$ValueHolder = new MoreObjects$ToStringHelper$ValueHolder(null);
        this.holderTail = moreObjects$ToStringHelper$ValueHolder;
        this.omitNullValues = false;
        this.omitEmptyValues = false;
        this.className = string2 = (String)Preconditions.checkNotNull(string2);
    }

    public /* synthetic */ MoreObjects$ToStringHelper(String string2, MoreObjects$1 moreObjects$1) {
        this(string2);
    }

    private MoreObjects$ToStringHelper$ValueHolder addHolder() {
        MoreObjects$ToStringHelper$ValueHolder moreObjects$ToStringHelper$ValueHolder;
        this.holderTail.next = moreObjects$ToStringHelper$ValueHolder = new MoreObjects$ToStringHelper$ValueHolder(null);
        this.holderTail = moreObjects$ToStringHelper$ValueHolder;
        return moreObjects$ToStringHelper$ValueHolder;
    }

    private MoreObjects$ToStringHelper addHolder(Object object) {
        this.addHolder().value = object;
        return this;
    }

    private MoreObjects$ToStringHelper addHolder(String string2, Object object) {
        MoreObjects$ToStringHelper$ValueHolder moreObjects$ToStringHelper$ValueHolder = this.addHolder();
        moreObjects$ToStringHelper$ValueHolder.value = object;
        moreObjects$ToStringHelper$ValueHolder.name = string2 = (String)Preconditions.checkNotNull(string2);
        return this;
    }

    private MoreObjects$ToStringHelper$UnconditionalValueHolder addUnconditionalHolder() {
        MoreObjects$ToStringHelper$UnconditionalValueHolder moreObjects$ToStringHelper$UnconditionalValueHolder = new MoreObjects$ToStringHelper$UnconditionalValueHolder(null);
        this.holderTail.next = moreObjects$ToStringHelper$UnconditionalValueHolder;
        this.holderTail = moreObjects$ToStringHelper$UnconditionalValueHolder;
        return moreObjects$ToStringHelper$UnconditionalValueHolder;
    }

    private MoreObjects$ToStringHelper addUnconditionalHolder(Object object) {
        this.addUnconditionalHolder().value = object;
        return this;
    }

    private MoreObjects$ToStringHelper addUnconditionalHolder(String string2, Object object) {
        MoreObjects$ToStringHelper$UnconditionalValueHolder moreObjects$ToStringHelper$UnconditionalValueHolder = this.addUnconditionalHolder();
        moreObjects$ToStringHelper$UnconditionalValueHolder.value = object;
        moreObjects$ToStringHelper$UnconditionalValueHolder.name = string2 = (String)Preconditions.checkNotNull(string2);
        return this;
    }

    private static boolean isEmpty(Object object) {
        int n3;
        boolean bl2 = object instanceof CharSequence;
        boolean bl3 = false;
        boolean bl4 = true;
        if (bl2) {
            int n4 = (object = (CharSequence)object).length();
            if (n4 == 0) {
                bl3 = true;
            }
            return bl3;
        }
        bl2 = object instanceof Collection;
        if (bl2) {
            return ((Collection)object).isEmpty();
        }
        bl2 = object instanceof Map;
        if (bl2) {
            return ((Map)object).isEmpty();
        }
        bl2 = object instanceof Optional;
        if (bl2) {
            return ((Optional)object).isPresent() ^ bl4;
        }
        Class<?> clazz = object.getClass();
        bl2 = clazz.isArray();
        if (bl2 && (n3 = Array.getLength(object)) == 0) {
            bl3 = true;
        }
        return bl3;
    }

    public MoreObjects$ToStringHelper add(String string2, char c2) {
        String string3 = String.valueOf(c2);
        return this.addUnconditionalHolder(string2, string3);
    }

    public MoreObjects$ToStringHelper add(String string2, double d2) {
        String string3 = String.valueOf(d2);
        return this.addUnconditionalHolder(string2, string3);
    }

    public MoreObjects$ToStringHelper add(String string2, float f5) {
        String string3 = String.valueOf(f5);
        return this.addUnconditionalHolder(string2, string3);
    }

    public MoreObjects$ToStringHelper add(String string2, int n3) {
        String string3 = String.valueOf(n3);
        return this.addUnconditionalHolder(string2, string3);
    }

    public MoreObjects$ToStringHelper add(String string2, long l2) {
        String string3 = String.valueOf(l2);
        return this.addUnconditionalHolder(string2, string3);
    }

    public MoreObjects$ToStringHelper add(String string2, Object object) {
        return this.addHolder(string2, object);
    }

    public MoreObjects$ToStringHelper add(String string2, boolean bl2) {
        String string3 = String.valueOf(bl2);
        return this.addUnconditionalHolder(string2, string3);
    }

    public MoreObjects$ToStringHelper addValue(char c2) {
        String string2 = String.valueOf(c2);
        return this.addUnconditionalHolder(string2);
    }

    public MoreObjects$ToStringHelper addValue(double d2) {
        String string2 = String.valueOf(d2);
        return this.addUnconditionalHolder(string2);
    }

    public MoreObjects$ToStringHelper addValue(float f5) {
        String string2 = String.valueOf(f5);
        return this.addUnconditionalHolder(string2);
    }

    public MoreObjects$ToStringHelper addValue(int n3) {
        String string2 = String.valueOf(n3);
        return this.addUnconditionalHolder(string2);
    }

    public MoreObjects$ToStringHelper addValue(long l2) {
        String string2 = String.valueOf(l2);
        return this.addUnconditionalHolder(string2);
    }

    public MoreObjects$ToStringHelper addValue(Object object) {
        return this.addHolder(object);
    }

    public MoreObjects$ToStringHelper addValue(boolean bl2) {
        String string2 = String.valueOf(bl2);
        return this.addUnconditionalHolder(string2);
    }

    public MoreObjects$ToStringHelper omitNullValues() {
        this.omitNullValues = true;
        return this;
    }

    public String toString() {
        int n3 = 1;
        boolean bl2 = this.omitNullValues;
        boolean bl3 = this.omitEmptyValues;
        StringBuilder stringBuilder = new StringBuilder(32);
        Object object = this.className;
        stringBuilder.append((String)object);
        char c2 = '{';
        stringBuilder.append(c2);
        object = this.holderHead.next;
        Object object2 = "";
        while (object != null) {
            Object object3 = ((MoreObjects$ToStringHelper$ValueHolder)object).value;
            boolean bl4 = object instanceof MoreObjects$ToStringHelper$UnconditionalValueHolder;
            if (bl4 || (object3 == null ? !bl2 : !bl3 || !(bl4 = MoreObjects$ToStringHelper.isEmpty(object3)))) {
                char c3;
                stringBuilder.append((String)object2);
                object2 = ((MoreObjects$ToStringHelper$ValueHolder)object).name;
                if (object2 != null) {
                    stringBuilder.append((String)object2);
                    c3 = '=';
                    stringBuilder.append(c3);
                }
                if (object3 != null && (c3 = (char)(((Class)(object2 = object3.getClass())).isArray() ? 1 : 0)) != '\u0000') {
                    object2 = new Object[n3];
                    bl4 = false;
                    object2[0] = object3;
                    object2 = Arrays.deepToString((Object[])object2);
                    int n4 = ((String)object2).length() - n3;
                    stringBuilder.append((CharSequence)object2, n3, n4);
                } else {
                    stringBuilder.append(object3);
                }
                object2 = ", ";
            }
            object = ((MoreObjects$ToStringHelper$ValueHolder)object).next;
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

