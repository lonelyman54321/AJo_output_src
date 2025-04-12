/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.exceptions;

import io.reactivex.exceptions.CompositeException$a;
import io.reactivex.exceptions.CompositeException$b;
import io.reactivex.exceptions.CompositeException$c;
import io.reactivex.exceptions.CompositeException$d;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public final class CompositeException
extends RuntimeException {
    private static final long serialVersionUID = 3026362227162912146L;
    public final List a;
    public final String b;
    public CompositeException$a c;

    public CompositeException(List object) {
        int n3;
        Serializable serializable = new LinkedHashSet();
        ArrayList<Object> arrayList = new ArrayList<Object>();
        if (object != null) {
            boolean bl2;
            object = object.iterator();
            while (bl2 = object.hasNext()) {
                Object object2 = (Throwable)object.next();
                boolean bl3 = object2 instanceof CompositeException;
                if (bl3) {
                    object2 = ((CompositeException)object2).a;
                    serializable.addAll(object2);
                    continue;
                }
                if (object2 != null) {
                    serializable.add(object2);
                    continue;
                }
                String string2 = "Throwable was null!";
                object2 = new NullPointerException(string2);
                serializable.add(object2);
            }
        } else {
            String string3 = "errors was null";
            super(string3);
            serializable.add(object);
        }
        if ((n3 = serializable.isEmpty()) == 0) {
            arrayList.addAll((Collection<Object>)((Object)serializable));
            object = Collections.unmodifiableList(arrayList);
            this.a = object;
            super();
            n3 = object.size();
            ((StringBuilder)serializable).append(n3);
            ((StringBuilder)serializable).append(" exceptions occurred. ");
            this.b = object = ((StringBuilder)serializable).toString();
            return;
        }
        object = new IllegalArgumentException("errors is empty");
        throw object;
    }

    public CompositeException(Throwable ... object) {
        object = Arrays.asList(object);
        this((List)object);
    }

    public static void a(StringBuilder stringBuilder, Throwable throwable, String object) {
        stringBuilder.append((String)object);
        stringBuilder.append(throwable);
        char c2 = '\n';
        stringBuilder.append(c2);
        for (StackTraceElement stackTraceElement : throwable.getStackTrace()) {
            String string2 = "\t\tat ";
            stringBuilder.append(string2);
            stringBuilder.append(stackTraceElement);
            stringBuilder.append(c2);
        }
        object = throwable.getCause();
        if (object != null) {
            stringBuilder.append("\tCaused by: ");
            throwable = throwable.getCause();
            object = "";
            CompositeException.a(stringBuilder, throwable, (String)object);
        }
    }

    public final void b(CompositeException$b compositeException$b) {
        Object object;
        int n3;
        CharSequence charSequence = new StringBuilder(128);
        ((StringBuilder)charSequence).append(this);
        char c2 = '\n';
        ((StringBuilder)charSequence).append(c2);
        StackTraceElement[] stackTraceElementArray = this.getStackTrace();
        int n4 = stackTraceElementArray.length;
        Throwable throwable = null;
        for (n3 = 0; n3 < n4; ++n3) {
            object = stackTraceElementArray[n3];
            String string2 = "\tat ";
            ((StringBuilder)charSequence).append(string2);
            ((StringBuilder)charSequence).append(object);
            ((StringBuilder)charSequence).append(c2);
        }
        Iterator iterator = this.a.iterator();
        int n7 = 1;
        n4 = 1;
        while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            throwable = (Throwable)iterator.next();
            ((StringBuilder)charSequence).append("  ComposedException ");
            ((StringBuilder)charSequence).append(n4);
            ((StringBuilder)charSequence).append(" :\n");
            object = "\t";
            CompositeException.a((StringBuilder)charSequence, throwable, (String)object);
            n4 += n7;
        }
        charSequence = ((StringBuilder)charSequence).toString();
        compositeException$b.a((String)charSequence);
    }

    /*
     * Exception decompiling
     */
    public final Throwable getCause() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 19[TRYBLOCK] [24 : 236->245)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public final String getMessage() {
        return this.b;
    }

    public final void printStackTrace() {
        PrintStream printStream = System.err;
        this.printStackTrace(printStream);
    }

    public final void printStackTrace(PrintStream printStream) {
        CompositeException$c compositeException$c = new CompositeException$c(printStream);
        this.b(compositeException$c);
    }

    public final void printStackTrace(PrintWriter printWriter) {
        CompositeException$d compositeException$d = new CompositeException$d(printWriter);
        this.b(compositeException$d);
    }
}

