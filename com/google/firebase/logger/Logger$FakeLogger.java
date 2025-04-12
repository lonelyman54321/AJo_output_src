/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
package com.google.firebase.logger;

import android.util.Log;
import com.google.firebase.logger.Logger;
import com.google.firebase.logger.Logger$Level;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

public final class Logger$FakeLogger
extends Logger {
    private final List record;

    public Logger$FakeLogger(String arrayList, boolean bl2, Logger$Level logger$Level) {
        Intrinsics.checkNotNullParameter(arrayList, "tag");
        Intrinsics.checkNotNullParameter((Object)logger$Level, "minLevel");
        super((String)((Object)arrayList), bl2, logger$Level, null);
        this.record = arrayList = new ArrayList();
    }

    private final String toLogMessage(Logger$Level logger$Level, String string2, Object[] objectArray, Throwable object) {
        block5: {
            char c2;
            block4: {
                Object object2;
                int n3 = objectArray.length;
                if (n3 != 0) {
                    object2 = StringCompanionObject.INSTANCE;
                    n3 = objectArray.length;
                    objectArray = Arrays.copyOf(objectArray, n3);
                    n3 = objectArray.length;
                    String string3 = "format(format, *args)";
                    string2 = xh2_0.a(objectArray, n3, string2, string3);
                }
                c2 = ' ';
                if (object == null) break block4;
                object2 = new StringBuilder();
                ((StringBuilder)object2).append((Object)logger$Level);
                ((StringBuilder)object2).append(c2);
                ((StringBuilder)object2).append(string2);
                ((StringBuilder)object2).append(c2);
                object = Log.getStackTraceString((Throwable)object);
                ((StringBuilder)object2).append((String)object);
                object = ((StringBuilder)object2).toString();
                if (object != null) break block5;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append((Object)logger$Level);
            ((StringBuilder)object).append(c2);
            ((StringBuilder)object).append(string2);
            object = ((StringBuilder)object).toString();
        }
        return object;
    }

    public final void clearLogMessages() {
        this.record.clear();
    }

    public final boolean hasLogMessage(String string2) {
        boolean bl2;
        block4: {
            Object object;
            boolean bl3;
            Object object2;
            block3: {
                Intrinsics.checkNotNullParameter(string2, "message");
                object2 = this.record;
                bl3 = object2 instanceof Collection;
                bl2 = false;
                if (!bl3) break block3;
                object = object2;
                object = (Collection)object2;
                bl3 = object.isEmpty();
                if (bl3) break block4;
            }
            object2 = object2.iterator();
            while (bl3 = object2.hasNext()) {
                object = (String)object2.next();
                bl3 = StringsKt.F((CharSequence)object, string2, false);
                if (!bl3) continue;
                bl2 = true;
                break;
            }
        }
        return bl2;
    }

    public final boolean hasLogMessageThat(Function1 function1) {
        boolean bl2;
        block4: {
            Object object;
            boolean bl3;
            Object object2;
            block3: {
                Intrinsics.checkNotNullParameter(function1, "predicate");
                object2 = this.record;
                bl3 = object2 instanceof Collection;
                bl2 = false;
                if (!bl3) break block3;
                object = object2;
                object = (Collection)object2;
                bl3 = object.isEmpty();
                if (bl3) break block4;
            }
            object2 = object2.iterator();
            while (bl3 = object2.hasNext()) {
                object = object2.next();
                bl3 = (Boolean)(object = (Boolean)function1.invoke(object));
                if (!bl3) continue;
                bl2 = true;
                break;
            }
        }
        return bl2;
    }

    public int log(Logger$Level object, String string2, Object[] objectArray, Throwable throwable) {
        Intrinsics.checkNotNullParameter(object, "level");
        Intrinsics.checkNotNullParameter(string2, "format");
        Intrinsics.checkNotNullParameter(objectArray, "args");
        object = this.toLogMessage((Logger$Level)((Object)object), string2, objectArray, throwable);
        string2 = kp1_0.c("Log: ", (String)object);
        System.out.println((Object)string2);
        this.record.add(object);
        return ((String)object).length();
    }
}

