/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.io;

import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Splitter;
import com.google.common.graph.SuccessorsFunction;
import com.google.common.graph.Traverser;
import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.io.ByteProcessor;
import com.google.common.io.ByteSink;
import com.google.common.io.ByteSource;
import com.google.common.io.CharSink;
import com.google.common.io.CharSource;
import com.google.common.io.Closer;
import com.google.common.io.FileWriteMode;
import com.google.common.io.Files$1;
import com.google.common.io.Files$2;
import com.google.common.io.Files$FileByteSink;
import com.google.common.io.Files$FileByteSource;
import com.google.common.io.Files$FilePredicate;
import com.google.common.io.LineProcessor;
import com.google.common.io.TempFileCreator;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public final class Files {
    private static final SuccessorsFunction FILE_TREE;

    static {
        Files$2 files$2 = new Files$2();
        FILE_TREE = files$2;
    }

    private Files() {
    }

    public static void append(CharSequence charSequence, File file, Charset charset) {
        FileWriteMode fileWriteMode = FileWriteMode.APPEND;
        FileWriteMode[] fileWriteModeArray = new FileWriteMode[]{fileWriteMode};
        Files.asCharSink(file, charset, fileWriteModeArray).write(charSequence);
    }

    public static ByteSink asByteSink(File file, FileWriteMode ... fileWriteModeArray) {
        Files$FileByteSink files$FileByteSink = new Files$FileByteSink(file, fileWriteModeArray, null);
        return files$FileByteSink;
    }

    public static ByteSource asByteSource(File file) {
        Files$FileByteSource files$FileByteSource = new Files$FileByteSource(file, null);
        return files$FileByteSource;
    }

    public static CharSink asCharSink(File file, Charset charset, FileWriteMode ... fileWriteModeArray) {
        return Files.asByteSink(file, fileWriteModeArray).asCharSink(charset);
    }

    public static CharSource asCharSource(File file, Charset charset) {
        return Files.asByteSource(file).asCharSource(charset);
    }

    public static void copy(File object, File object2) {
        Preconditions.checkArgument(((File)object).equals(object2) ^ true, "Source %s and destination %s must be different", object, object2);
        object = Files.asByteSource((File)object);
        FileWriteMode[] fileWriteModeArray = new FileWriteMode[]{};
        object2 = Files.asByteSink((File)object2, fileWriteModeArray);
        ((ByteSource)object).copyTo((ByteSink)object2);
    }

    public static void copy(File file, OutputStream outputStream) {
        Files.asByteSource(file).copyTo(outputStream);
    }

    public static void copy(File file, Charset charset, Appendable appendable) {
        Files.asCharSource(file, charset).copyTo(appendable);
    }

    public static void createParentDirs(File object) {
        Preconditions.checkNotNull(object);
        Serializable serializable = ((File)object).getCanonicalFile().getParentFile();
        if (serializable == null) {
            return;
        }
        serializable.mkdirs();
        boolean bl2 = serializable.isDirectory();
        if (bl2) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Unable to create parent directories of ");
        stringBuilder.append(object);
        object = stringBuilder.toString();
        serializable = new IOException((String)object);
        throw serializable;
    }

    public static File createTempDir() {
        return TempFileCreator.INSTANCE.createTempDir();
    }

    public static boolean equal(File object, File object2) {
        boolean bl2;
        Preconditions.checkNotNull(object);
        Preconditions.checkNotNull(object2);
        if (object != object2 && !(bl2 = ((File)object).equals(object2))) {
            long l2;
            long l3 = ((File)object).length();
            long l4 = ((File)object2).length();
            long l7 = 0L;
            long l8 = l3 - l7;
            Object object3 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
            if (object3 != false && (object3 = l4 == l7 ? 0 : (l4 < l7 ? -1 : 1)) != false && (l2 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1)) != false) {
                return false;
            }
            object = Files.asByteSource((File)object);
            object2 = Files.asByteSource((File)object2);
            return ((ByteSource)object).contentEquals((ByteSource)object2);
        }
        return true;
    }

    public static Traverser fileTraverser() {
        return Traverser.forTree(FILE_TREE);
    }

    public static String getFileExtension(String string2) {
        Preconditions.checkNotNull(string2);
        File file = new File(string2);
        string2 = file.getName();
        int n3 = string2.lastIndexOf(46);
        int n4 = -1;
        string2 = n3 == n4 ? "" : string2.substring(++n3);
        return string2;
    }

    public static String getNameWithoutExtension(String string2) {
        Preconditions.checkNotNull(string2);
        File file = new File(string2);
        string2 = file.getName();
        int n3 = string2.lastIndexOf(46);
        int n4 = -1;
        if (n3 != n4) {
            n4 = 0;
            string2 = string2.substring(0, n3);
        }
        return string2;
    }

    public static HashCode hash(File file, HashFunction hashFunction) {
        return Files.asByteSource(file).hash(hashFunction);
    }

    public static Predicate isDirectory() {
        return Files$FilePredicate.IS_DIRECTORY;
    }

    public static Predicate isFile() {
        return Files$FilePredicate.IS_FILE;
    }

    public static MappedByteBuffer map(File file) {
        Preconditions.checkNotNull(file);
        FileChannel.MapMode mapMode = FileChannel.MapMode.READ_ONLY;
        return Files.map(file, mapMode);
    }

    public static MappedByteBuffer map(File file, FileChannel.MapMode mapMode) {
        return Files.mapInternal(file, mapMode, -1);
    }

    public static MappedByteBuffer map(File file, FileChannel.MapMode mapMode, long l2) {
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object >= 0;
        Preconditions.checkArgument(bl2, "size (%s) may not be negative", l2);
        return Files.mapInternal(file, mapMode, l2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static MappedByteBuffer mapInternal(File object, FileChannel.MapMode mapMode, long l2) {
        Throwable throwable2;
        Closer closer;
        block6: {
            Object object2;
            Preconditions.checkNotNull(object);
            Preconditions.checkNotNull(mapMode);
            closer = Closer.create();
            try {
                object2 = FileChannel.MapMode.READ_ONLY;
                object2 = mapMode == object2 ? "r" : "rw";
            }
            catch (Throwable throwable2) {
                break block6;
            }
            {
                Object object3 = new RandomAccessFile((File)object, (String)object2);
                object = closer.register((Closeable)object3);
                object = (RandomAccessFile)object;
                object = ((RandomAccessFile)object).getChannel();
                object3 = object = closer.register((Closeable)object);
                object3 = (FileChannel)object;
                long l3 = -1;
                long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                if (l4 == false) {
                    l2 = ((FileChannel)object3).size();
                }
                long l7 = 0L;
                object2 = mapMode;
                object = ((FileChannel)object3).map(mapMode, l7, l2);
                closer.close();
                return object;
            }
        }
        try {
            RuntimeException runtimeException = closer.rethrow(throwable2);
            throw runtimeException;
        }
        catch (Throwable throwable3) {
            closer.close();
            throw throwable3;
        }
    }

    public static void move(File object, File object2) {
        Preconditions.checkNotNull(object);
        Preconditions.checkNotNull(object2);
        boolean bl2 = ((File)object).equals(object2) ^ true;
        String string2 = "Source %s and destination %s must be different";
        Preconditions.checkArgument(bl2, string2, object, object2);
        bl2 = ((File)object).renameTo((File)object2);
        if (!bl2) {
            Files.copy((File)object, (File)object2);
            bl2 = ((File)object).delete();
            if (!bl2) {
                bl2 = ((File)object2).delete();
                string2 = "Unable to delete ";
                if (!bl2) {
                    StringBuilder stringBuilder = new StringBuilder(string2);
                    stringBuilder.append(object2);
                    object2 = stringBuilder.toString();
                    object = new IOException((String)object2);
                    throw object;
                }
                StringBuilder stringBuilder = new StringBuilder(string2);
                stringBuilder.append(object);
                object = stringBuilder.toString();
                object2 = new IOException((String)object);
                throw object2;
            }
        }
    }

    public static BufferedReader newReader(File file, Charset charset) {
        Preconditions.checkNotNull(file);
        Preconditions.checkNotNull(charset);
        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader((InputStream)fileInputStream, charset);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        return bufferedReader;
    }

    public static BufferedWriter newWriter(File file, Charset charset) {
        Preconditions.checkNotNull(file);
        Preconditions.checkNotNull(charset);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter((OutputStream)fileOutputStream, charset);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        return bufferedWriter;
    }

    public static Object readBytes(File file, ByteProcessor byteProcessor) {
        return Files.asByteSource(file).read(byteProcessor);
    }

    public static String readFirstLine(File file, Charset charset) {
        return Files.asCharSource(file, charset).readFirstLine();
    }

    public static Object readLines(File file, Charset charset, LineProcessor lineProcessor) {
        return Files.asCharSource(file, charset).readLines(lineProcessor);
    }

    public static List readLines(File object, Charset object2) {
        object = Files.asCharSource((File)object, (Charset)object2);
        object2 = new Files$1();
        return (List)((CharSource)object).readLines((LineProcessor)object2);
    }

    public static String simplifyPath(String string2) {
        int n3;
        String string3 = "..";
        Preconditions.checkNotNull(string2);
        int c2 = string2.length();
        Object object = ".";
        if (c2 == 0) {
            return object;
        }
        int n4 = 47;
        Object object2 = Splitter.on((char)n4).omitEmptyStrings().split(string2);
        ArrayList<String> arrayList = new ArrayList<String>();
        object2 = object2.iterator();
        while ((n3 = object2.hasNext()) != 0) {
            String string4;
            String string5 = (String)object2.next();
            string5.getClass();
            int n7 = string5.equals(object);
            if (n7 != 0) continue;
            n7 = string5.equals(string3);
            if (n7 == 0) {
                arrayList.add(string5);
                continue;
            }
            n3 = arrayList.size();
            if (n3 > 0 && (n7 = (string4 = (String)pp_0.a(n3 = 1, arrayList)).equals(string3)) == 0) {
                n7 = arrayList.size() - n3;
                arrayList.remove(n7);
                continue;
            }
            arrayList.add(string3);
        }
        string3 = Joiner.on((char)n4).join(arrayList);
        int n8 = string2.charAt(0);
        object2 = "/";
        if (n8 == n4) {
            string3 = kp1_0.c((String)object2, string3);
        }
        while ((n8 = (int)(string3.startsWith(string2 = "/../") ? 1 : 0)) != 0) {
            n8 = 3;
            string3 = string3.substring(n8);
        }
        string2 = "/..";
        n8 = (int)(string3.equals(string2) ? 1 : 0);
        if (n8 != 0) {
            object = object2;
        } else {
            string2 = "";
            n8 = (int)(string2.equals(string3) ? 1 : 0);
            if (n8 == 0) {
                object = string3;
            }
        }
        return object;
    }

    public static byte[] toByteArray(File file) {
        return Files.asByteSource(file).read();
    }

    public static String toString(File file, Charset charset) {
        return Files.asCharSource(file, charset).read();
    }

    public static void touch(File object) {
        long l2;
        Preconditions.checkNotNull(object);
        boolean bl2 = ((File)object).createNewFile();
        if (!bl2 && !(bl2 = ((File)object).setLastModified(l2 = System.currentTimeMillis()))) {
            StringBuilder stringBuilder = new StringBuilder("Unable to update modification time of ");
            stringBuilder.append(object);
            object = stringBuilder.toString();
            IOException iOException = new IOException((String)object);
            throw iOException;
        }
    }

    public static void write(CharSequence charSequence, File file, Charset charset) {
        FileWriteMode[] fileWriteModeArray = new FileWriteMode[]{};
        Files.asCharSink(file, charset, fileWriteModeArray).write(charSequence);
    }

    public static void write(byte[] byArray, File file) {
        FileWriteMode[] fileWriteModeArray = new FileWriteMode[]{};
        Files.asByteSink(file, fileWriteModeArray).write(byArray);
    }
}

