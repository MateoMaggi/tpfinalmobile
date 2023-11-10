package com.example.tpfinal;

import java.lang.System;

@androidx.room.Entity(tableName = "notes")
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lcom/example/tpfinal/Note;", "", "dateAdded", "Ljava/util/Date;", "noteText", "", "(Ljava/util/Date;Ljava/lang/String;)V", "getDateAdded", "()Ljava/util/Date;", "getNoteText", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class Note {
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "dateAdded")
    @androidx.room.PrimaryKey
    private final java.util.Date dateAdded = null;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "noteText")
    private final java.lang.String noteText = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.example.tpfinal.Note copy(@org.jetbrains.annotations.NotNull
    java.util.Date dateAdded, @org.jetbrains.annotations.NotNull
    java.lang.String noteText) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public Note(@org.jetbrains.annotations.NotNull
    java.util.Date dateAdded, @org.jetbrains.annotations.NotNull
    java.lang.String noteText) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Date component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Date getDateAdded() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getNoteText() {
        return null;
    }
}