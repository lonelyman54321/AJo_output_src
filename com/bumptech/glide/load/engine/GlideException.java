/*
 * Decompiled with CFR 0.152.
 */
package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.engine.GlideException$a;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class GlideException
extends Exception {
    public static final StackTraceElement[] f = new StackTraceElement[0];
    private static final long serialVersionUID = 1L;
    public final List a;
    public qn1_0 b;
    public pi0_0 c;
    public Class d;
    public final String e;

    public GlideException(String string2) {
        List list = Collections.emptyList();
        this(string2, list);
    }

    public GlideException(String stackTraceElementArray, List list) {
        this.e = stackTraceElementArray;
        stackTraceElementArray = f;
        this.setStackTrace(stackTraceElementArray);
        this.a = list;
    }

    public static void a(Throwable object, ArrayList arrayList) {
        boolean bl2 = object instanceof GlideException;
        if (bl2) {
            object = ((GlideException)object).a.iterator();
            while (bl2 = object.hasNext()) {
                Throwable throwable = (Throwable)object.next();
                GlideException.a(throwable, arrayList);
            }
        } else {
            arrayList.add(object);
        }
    }

    public static void b(List list, GlideException$a glideException$a) {
        int n3 = list.size();
        int n4 = 0;
        Throwable throwable = null;
        while (n4 < n3) {
            String string2 = "Cause (";
            glideException$a.append(string2);
            int n7 = n4 + 1;
            String string3 = String.valueOf(n7);
            glideException$a.append(string3);
            glideException$a.append(" of ");
            string3 = String.valueOf(n3);
            glideException$a.append(string3);
            string3 = "): ";
            glideException$a.append(string3);
            throwable = (Throwable)list.get(n4);
            boolean bl2 = throwable instanceof GlideException;
            if (bl2) {
                throwable = (GlideException)throwable;
                ((GlideException)throwable).d(glideException$a);
            } else {
                GlideException.c(throwable, glideException$a);
            }
            n4 = n7;
        }
    }

    public static void c(Throwable throwable, Appendable object) {
        Object object2;
        try {
            object2 = throwable.getClass();
        }
        catch (IOException iOException) {
            object = new RuntimeException(throwable);
            throw object;
        }
        object2 = ((Class)object2).toString();
        object = object.append((CharSequence)object2);
        object2 = ": ";
        object = object.append((CharSequence)object2);
        object2 = throwable.getMessage();
        object = object.append((CharSequence)object2);
        char c2 = '\n';
        object.append(c2);
    }

    public final void d(Appendable object) {
        GlideException.c(this, (Appendable)object);
        Object object2 = new GlideException$a((Appendable)object);
        object = this.a;
        try {
            GlideException.b((List)object, (GlideException$a)object2);
            return;
        }
        catch (IOException iOException) {
            object2 = new RuntimeException(iOException);
            throw object2;
        }
    }

    public final Throwable fillInStackTrace() {
        return this;
    }

    public final String getMessage() {
        char c2;
        int n3;
        Object object;
        int n4 = 71;
        StringBuilder stringBuilder = new StringBuilder(n4);
        Object object2 = this.e;
        stringBuilder.append((String)object2);
        object2 = this.d;
        Object object3 = "";
        String string2 = ", ";
        if (object2 != null) {
            object2 = new StringBuilder(string2);
            object = this.d;
            ((StringBuilder)object2).append(object);
            object2 = ((StringBuilder)object2).toString();
        } else {
            object2 = object3;
        }
        stringBuilder.append((String)object2);
        object2 = this.c;
        if (object2 != null) {
            object2 = new StringBuilder(string2);
            object = this.c;
            ((StringBuilder)object2).append(object);
            object2 = ((StringBuilder)object2).toString();
        } else {
            object2 = object3;
        }
        stringBuilder.append((String)object2);
        object2 = this.b;
        if (object2 != null) {
            object2 = new StringBuilder(string2);
            object3 = this.b;
            ((StringBuilder)object2).append(object3);
            object3 = ((StringBuilder)object2).toString();
        }
        stringBuilder.append((String)object3);
        object2 = new ArrayList();
        GlideException.a(this, (ArrayList)object2);
        boolean n7 = ((ArrayList)object2).isEmpty();
        if (n7) {
            return stringBuilder.toString();
        }
        int n8 = ((ArrayList)object2).size();
        if (n8 == (n3 = 1)) {
            object3 = "\nThere was 1 root cause:";
            stringBuilder.append((String)object3);
        } else {
            stringBuilder.append("\nThere were ");
            int n10 = ((ArrayList)object2).size();
            stringBuilder.append(n10);
            object3 = " root causes:";
            stringBuilder.append((String)object3);
        }
        object2 = ((ArrayList)object2).iterator();
        while ((c2 = object2.hasNext()) != '\u0000') {
            object3 = (Throwable)object2.next();
            stringBuilder.append('\n');
            string2 = object3.getClass().getName();
            stringBuilder.append(string2);
            n3 = 40;
            stringBuilder.append((char)n3);
            object3 = ((Throwable)object3).getMessage();
            stringBuilder.append((String)object3);
            c2 = ')';
            stringBuilder.append(c2);
        }
        stringBuilder.append("\n call GlideException#logRootCauses(String) for more detail");
        return stringBuilder.toString();
    }

    public final void printStackTrace() {
        PrintStream printStream = System.err;
        this.d(printStream);
    }

    public final void printStackTrace(PrintStream printStream) {
        this.d(printStream);
    }

    public final void printStackTrace(PrintWriter printWriter) {
        this.d(printWriter);
    }
}

