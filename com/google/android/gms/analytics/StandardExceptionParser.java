/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.analytics;

import android.content.Context;
import com.google.android.gms.analytics.ExceptionParser;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class StandardExceptionParser
implements ExceptionParser {
    private final TreeSet zza;

    public StandardExceptionParser(Context context, Collection collection) {
        TreeSet treeSet;
        this.zza = treeSet = new TreeSet();
        this.setIncludedPackages(context, collection);
    }

    public StackTraceElement getBestStackTraceElement(Throwable stackTraceElementArray) {
        int n3;
        if ((stackTraceElementArray = stackTraceElementArray.getStackTrace()) != null && (n3 = stackTraceElementArray.length) != 0) {
            for (int i3 = 0; i3 < n3; ++i3) {
                boolean bl2;
                StackTraceElement stackTraceElement = stackTraceElementArray[i3];
                String string2 = stackTraceElement.getClassName();
                Iterator iterator = this.zza.iterator();
                while (bl2 = iterator.hasNext()) {
                    String string3 = (String)iterator.next();
                    bl2 = string2.startsWith(string3);
                    if (!bl2) continue;
                    return stackTraceElement;
                }
            }
            return stackTraceElementArray[0];
        }
        return null;
    }

    public Throwable getCause(Throwable throwable) {
        Throwable throwable2;
        while ((throwable2 = throwable.getCause()) != null) {
            throwable = throwable.getCause();
        }
        return throwable;
    }

    public String getDescription(String string2, Throwable serializable) {
        Throwable throwable = this.getCause((Throwable)serializable);
        serializable = this.getCause((Throwable)serializable);
        serializable = this.getBestStackTraceElement((Throwable)serializable);
        return this.getDescription(throwable, (StackTraceElement)serializable, string2);
    }

    public String getDescription(Throwable object, StackTraceElement object2, String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        object = object.getClass().getSimpleName();
        stringBuilder.append((String)object);
        if (object2 != null) {
            int n3;
            object = ((StackTraceElement)object2).getClassName();
            String string3 = "\\.";
            object = (object = ((String)object).split(string3)) != null && (n3 = ((String[])object).length) > 0 ? object[n3 += -1] : "unknown";
            string3 = ((StackTraceElement)object2).getMethodName();
            int n4 = ((StackTraceElement)object2).getLineNumber();
            String string4 = " (@";
            String string5 = ":";
            object = og_1.a(string4, (String)object, string5, string3, string5);
            ((StringBuilder)object).append(n4);
            object2 = ")";
            ((StringBuilder)object).append((String)object2);
            object = ((StringBuilder)object).toString();
            stringBuilder.append((String)object);
        }
        if (string2 != null) {
            object = new StringBuilder(" {");
            ((StringBuilder)object).append(string2);
            object2 = "}";
            ((StringBuilder)object).append((String)object2);
            object = ((StringBuilder)object).toString();
            stringBuilder.append((String)object);
        }
        return stringBuilder.toString();
    }

    public void setIncludedPackages(Context object, Collection object2) {
        boolean bl2;
        this.zza.clear();
        Object object3 = new HashSet();
        if (object2 != null) {
            object3.addAll(object2);
        }
        if (object != null) {
            object = object.getApplicationContext().getPackageName();
            ((HashSet)object3).add(object);
        }
        object = ((HashSet)object3).iterator();
        while (bl2 = object.hasNext()) {
            boolean bl3;
            object2 = (String)object.next();
            object3 = this.zza.iterator();
            boolean bl4 = true;
            while (bl3 = object3.hasNext()) {
                String string2 = (String)object3.next();
                boolean bl5 = ((String)object2).startsWith(string2);
                if (!bl5) {
                    boolean bl6 = string2.startsWith((String)object2);
                    if (!bl6) break;
                    object3 = this.zza;
                    ((TreeSet)object3).remove(string2);
                    break;
                }
                bl4 = false;
            }
            if (!bl4) continue;
            object3 = this.zza;
            ((TreeSet)object3).add(object2);
        }
    }
}

