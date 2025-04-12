/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.cache;

import com.google.common.base.Strings;
import com.google.common.cache.CacheBuilderSpec;
import com.google.common.cache.CacheBuilderSpec$ValueParser;
import java.util.concurrent.TimeUnit;

abstract class CacheBuilderSpec$DurationParser
implements CacheBuilderSpec$ValueParser {
    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void parse(CacheBuilderSpec object, String string2, String string3) {
        TimeUnit timeUnit;
        int n3;
        int n4 = 2;
        int n7 = 1;
        int n8 = Strings.isNullOrEmpty(string3);
        if (n8 != 0) {
            string2 = cP.a("value of key ", string2, " omitted");
            object = new IllegalArgumentException(string2);
            throw object;
        }
        try {
            n8 = string3.length() - n7;
        }
        catch (NumberFormatException numberFormatException) {
            Object[] objectArray = new Object[n4];
            objectArray[0] = string2;
            objectArray[n7] = string3;
            string2 = CacheBuilderSpec.access$000("key %s value set to %s, must be integer", objectArray);
            object = new IllegalArgumentException(string2);
            throw object;
        }
        {
            block10: {
                block11: {
                    n8 = string3.charAt(n8);
                    n3 = 100;
                    if (n8 == n3) break block11;
                    n3 = 104;
                    if (n8 != n3) {
                        n3 = 109;
                        if (n8 != n3) {
                            n3 = 115;
                            if (n8 != n3) {
                                String string4 = "key %s invalid unit: was %s, must end with one of [dhms]";
                                Object[] objectArray = new Object[n4];
                                objectArray[0] = string2;
                                objectArray[n7] = string3;
                                string4 = CacheBuilderSpec.access$000(string4, objectArray);
                                object = new IllegalArgumentException(string4);
                                throw object;
                            }
                            timeUnit = TimeUnit.SECONDS;
                            break block10;
                        } else {
                            timeUnit = TimeUnit.MINUTES;
                        }
                        break block10;
                    } else {
                        timeUnit = TimeUnit.HOURS;
                    }
                    break block10;
                }
                timeUnit = TimeUnit.DAYS;
            }
            n3 = string3.length() - n7;
        }
        {
            String string5 = string3.substring(0, n3);
            long l2 = Long.parseLong(string5);
            this.parseDuration((CacheBuilderSpec)object, l2, timeUnit);
            return;
        }
    }

    public abstract void parseDuration(CacheBuilderSpec var1, long var2, TimeUnit var4);
}

