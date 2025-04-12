/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.common.NativeSessionFile;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload$File;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

class FileBackedNativeSessionFile
implements NativeSessionFile {
    private final String dataTransportFilename;
    private final File file;
    private final String reportsEndpointFilename;

    public FileBackedNativeSessionFile(String string2, String string3, File file) {
        this.dataTransportFilename = string2;
        this.reportsEndpointFilename = string3;
        this.file = file;
    }

    /*
     * Exception decompiling
     */
    private byte[] asGzippedBytes() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 10[TRYBLOCK] [10 : 95->105)] java.lang.Throwable
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

    public CrashlyticsReport$FilesPayload$File asFilePayload() {
        Object object = this.asGzippedBytes();
        if (object != null) {
            object = CrashlyticsReport$FilesPayload$File.builder().setContents((byte[])object);
            String string2 = this.dataTransportFilename;
            object = object.setFilename(string2).build();
        } else {
            object = null;
        }
        return object;
    }

    public String getReportsEndpointFilename() {
        return this.reportsEndpointFilename;
    }

    public InputStream getStream() {
        Object object = this.file;
        boolean bl2 = ((File)object).exists();
        if (bl2 && (bl2 = ((File)(object = this.file)).isFile())) {
            File file;
            try {
                file = this.file;
            }
            catch (FileNotFoundException fileNotFoundException) {}
            object = new FileInputStream(file);
            return object;
        }
        return null;
    }
}

