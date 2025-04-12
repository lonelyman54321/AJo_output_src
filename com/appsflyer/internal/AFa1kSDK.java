/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Process
 *  android.view.KeyEvent
 *  android.view.View
 *  android.view.ViewConfiguration
 */
package com.appsflyer.internal;

import android.os.Process;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.appsflyer.internal.AFa1gSDK;
import com.appsflyer.internal.AFa1kSDK$AFa1ySDK;
import com.appsflyer.internal.AFa1lSDK;
import com.appsflyer.internal.AFa1vSDK;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

public final class AFa1kSDK {
    private final List AFAdRevenueData;
    private final String getCurrencyIso4217Code;
    private StringBuilder getMediationNetwork;

    public AFa1kSDK() {
        Serializable serializable;
        this.getMediationNetwork = serializable = new StringBuilder();
        this.AFAdRevenueData = serializable;
        this.getCurrencyIso4217Code = null;
    }

    private void getMediationNetwork() {
        Object object;
        Object object2 = this.AFAdRevenueData;
        boolean bl2 = object2.isEmpty();
        if (bl2) {
            return;
        }
        object2 = this.getMonetizationNetwork();
        if (object2 == (object = AFa1kSDK$AFa1ySDK.getMonetizationNetwork)) {
            object2 = AFa1kSDK$AFa1ySDK.getCurrencyIso4217Code;
            object = this.AFAdRevenueData;
            int n3 = object.size() + -1;
            object.set(n3, object2);
            return;
        }
        object = AFa1kSDK$AFa1ySDK.getCurrencyIso4217Code;
        if (object2 == object) {
            this.getMediationNetwork.append(',');
            return;
        }
        object = AFa1kSDK$AFa1ySDK.getMediationNetwork;
        if (object2 == object) {
            this.getMediationNetwork.append(":");
            object2 = AFa1kSDK$AFa1ySDK.getRevenue;
            object = this.AFAdRevenueData;
            int n4 = object.size() + -1;
            object.set(n4, object2);
            return;
        }
        object = AFa1kSDK$AFa1ySDK.areAllFieldsValid;
        if (object2 == object) {
            return;
        }
        object2 = new AFa1gSDK("Nesting problem");
        throw object2;
    }

    private AFa1kSDK$AFa1ySDK getMonetizationNetwork() {
        Object object = this.AFAdRevenueData;
        boolean bl2 = object.isEmpty();
        if (!bl2) {
            object = this.AFAdRevenueData;
            return (AFa1kSDK$AFa1ySDK)((Object)on_2.d(1, (List)object));
        }
        object = new AFa1gSDK("Nesting problem");
        throw object;
    }

    public final AFa1kSDK AFAdRevenueData(AFa1kSDK$AFa1ySDK object, AFa1kSDK$AFa1ySDK aFa1kSDK$AFa1ySDK, String string2) {
        AFa1kSDK$AFa1ySDK aFa1kSDK$AFa1ySDK2 = this.getMonetizationNetwork();
        if (aFa1kSDK$AFa1ySDK2 != aFa1kSDK$AFa1ySDK && aFa1kSDK$AFa1ySDK2 != object) {
            object = new AFa1gSDK("Nesting problem");
            throw object;
        }
        object = this.AFAdRevenueData;
        int n3 = object.size() + -1;
        object.remove(n3);
        this.getMediationNetwork.append(string2);
        return this;
    }

    public final AFa1kSDK AFAdRevenueData(AFa1kSDK$AFa1ySDK object, String string2) {
        Object object2 = this.AFAdRevenueData;
        int n3 = object2.isEmpty();
        if (n3 != 0 && (n3 = ((StringBuilder)(object2 = this.getMediationNetwork)).length()) > 0) {
            object = new AFa1gSDK("Nesting problem: multiple top-level roots");
            throw object;
        }
        this.getMediationNetwork();
        this.AFAdRevenueData.add(object);
        this.getMediationNetwork.append(string2);
        return this;
    }

    public final void getCurrencyIso4217Code() {
        Object object;
        block4: {
            Object object2;
            block3: {
                block2: {
                    object = this.getMonetizationNetwork();
                    if (object != (object2 = AFa1kSDK$AFa1ySDK.getRevenue)) break block2;
                    object = this.getMediationNetwork;
                    char c2 = ',';
                    ((StringBuilder)object).append(c2);
                    break block3;
                }
                object2 = AFa1kSDK$AFa1ySDK.AFAdRevenueData;
                if (object != object2) break block4;
            }
            object = AFa1kSDK$AFa1ySDK.getMediationNetwork;
            object2 = this.AFAdRevenueData;
            int n3 = object2.size() + -1;
            object2.set(n3, object);
            return;
        }
        object = new AFa1gSDK("Nesting problem");
        throw object;
    }

    public final void getMediationNetwork(String string2) {
        int n3 = 1;
        StringBuilder stringBuilder = this.getMediationNetwork;
        String string3 = "\"";
        stringBuilder.append(string3);
        int n4 = string2.length();
        for (int i3 = 0; i3 < n4; i3 += n3) {
            Object object;
            CharSequence charSequence;
            char c2;
            char c3 = string2.charAt(i3);
            if (c3 != (c2 = '\f')) {
                c2 = '\r';
                if (c3 != c2) {
                    c2 = '\"';
                    char c5 = '\\';
                    if (c3 != c2 && c3 != (c2 = '/') && c3 != c5) {
                        switch (c3) {
                            default: {
                                c2 = '\u001f';
                                if (c3 <= c2) {
                                    charSequence = this.getMediationNetwork;
                                    object = (int)c3;
                                    Object[] objectArray = new Object[n3];
                                    objectArray[0] = object;
                                    object = String.format("\\u%04x", objectArray);
                                    ((StringBuilder)charSequence).append((String)object);
                                    break;
                                }
                                charSequence = this.getMediationNetwork;
                                ((StringBuilder)charSequence).append(c3);
                                break;
                            }
                            case '\n': {
                                object = this.getMediationNetwork;
                                charSequence = "\\n";
                                ((StringBuilder)object).append((String)charSequence);
                                break;
                            }
                            case '\t': {
                                object = this.getMediationNetwork;
                                charSequence = "\\t";
                                ((StringBuilder)object).append((String)charSequence);
                                break;
                            }
                            case '\b': {
                                object = this.getMediationNetwork;
                                charSequence = "\\b";
                                ((StringBuilder)object).append((String)charSequence);
                                break;
                            }
                        }
                        continue;
                    }
                    charSequence = this.getMediationNetwork;
                    ((StringBuilder)charSequence).append(c5);
                    ((StringBuilder)charSequence).append(c3);
                    continue;
                }
                object = this.getMediationNetwork;
                charSequence = "\\r";
                ((StringBuilder)object).append((String)charSequence);
                continue;
            }
            object = this.getMediationNetwork;
            charSequence = "\\f";
            ((StringBuilder)object).append((String)charSequence);
        }
        this.getMediationNetwork.append(string3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final AFa1kSDK getMonetizationNetwork(Object object) {
        Object object2;
        int n3 = 1;
        List list = this.AFAdRevenueData;
        int n4 = list.isEmpty();
        if (n4 != 0) {
            object = new AFa1gSDK("Nesting problem");
            throw object;
        }
        n4 = View.resolveSize((int)0, (int)0);
        n4 = 37 - n4;
        int n7 = Process.getThreadPriority((int)0) + 20 >> 6;
        n7 = 159 - n7;
        String string2 = "";
        int n8 = Process.getGidForName((String)string2);
        Class clazz = (Class)AFa1vSDK.getRevenue(n4, n7, (char)(n8 = (int)((char)(-1 - n8))));
        if ((n4 = (int)(clazz.isInstance(object) ? 1 : 0)) != 0) {
            try {
                Object[] objectArray = new Object[n3];
                objectArray[0] = this;
                Map map2 = AFa1vSDK.registerClient;
                n8 = 1161076700;
                Object object3 = n8;
                object3 = map2.get(object3);
                if (object3 == null) {
                    Class<AFa1kSDK> clazz2;
                    int n10 = (byte)KeyEvent.getModifierMetaStateMask() + 38;
                    int n14 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 159;
                    char c2 = (char)(ViewConfiguration.getWindowTouchSlop() >> 8);
                    object3 = AFa1vSDK.getRevenue(n10, n14, c2);
                    object3 = (Class)object3;
                    String string3 = "getCurrencyIso4217Code";
                    Class[] classArray = new Class[n3];
                    classArray[0] = clazz2 = AFa1kSDK.class;
                    object3 = ((Class)object3).getDeclaredMethod(string3, classArray);
                    Integer n15 = n8;
                    map2.put(n15, object3);
                }
                object3 = (Method)object3;
                ((Method)object3).invoke(object, objectArray);
                return this;
            }
            catch (Throwable throwable) {
                Throwable throwable2 = throwable.getCause();
                if (throwable2 == null) throw throwable;
                throw throwable2;
            }
        }
        n3 = object instanceof AFa1lSDK;
        if (n3 != 0) {
            ((AFa1lSDK)object).getCurrencyIso4217Code(this);
            return this;
        }
        this.getMediationNetwork();
        if (object != null && (n3 = object instanceof Boolean) == 0 && object != (object2 = AFa1lSDK.AFAdRevenueData)) {
            n3 = object instanceof Number;
            if (n3 != 0) {
                StringBuilder stringBuilder = this.getMediationNetwork;
                object = AFa1lSDK.getCurrencyIso4217Code((Number)object);
                stringBuilder.append((String)object);
                return this;
            }
            object = object.toString();
            this.getMediationNetwork((String)object);
            return this;
        }
        StringBuilder stringBuilder = this.getMediationNetwork;
        stringBuilder.append(object);
        return this;
    }

    public final String toString() {
        StringBuilder stringBuilder = this.getMediationNetwork;
        int n3 = stringBuilder.length();
        if (n3 == 0) {
            return null;
        }
        return ((Object)this.getMediationNetwork).toString();
    }
}

