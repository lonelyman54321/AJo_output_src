/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.helper;

import java.util.ArrayList;
import org.jsoup.helper.Validate;

public class ValidationException
extends IllegalArgumentException {
    public static final String Validator = Validate.class.getName();

    public ValidationException(String string2) {
        super(string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Throwable fillInStackTrace() {
        synchronized (this) {
            int n3;
            int n4;
            ArrayList<StackTraceElement> arrayList;
            StackTraceElement[] stackTraceElementArray;
            try {
                super.fillInStackTrace();
                stackTraceElementArray = this.getStackTrace();
                arrayList = new ArrayList<StackTraceElement>();
                n4 = stackTraceElementArray.length;
                n3 = 0;
            }
            catch (Throwable throwable) {}
            throw throwable;
            while (true) {
                String string2;
                if (n3 >= n4) {
                    stackTraceElementArray = new StackTraceElement[]{};
                    stackTraceElementArray = arrayList.toArray(stackTraceElementArray);
                    this.setStackTrace(stackTraceElementArray);
                    return this;
                }
                StackTraceElement stackTraceElement = stackTraceElementArray[n3];
                String string3 = stackTraceElement.getClassName();
                boolean bl2 = string3.equals(string2 = Validator);
                if (!bl2) {
                    arrayList.add(stackTraceElement);
                }
                ++n3;
            }
        }
    }
}

