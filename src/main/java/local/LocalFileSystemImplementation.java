package local;

import meta.FileMetaData;
import system.FileSystem;
import system.FileSystemManager;

import java.io.File;
import java.util.List;

public class LocalFileSystemImplementation implements FileSystem<File> {

    static {
        FileSystemManager.registerSystem(new LocalFileSystemImplementation());
    }

    private LocalFileSystemImplementation() {}

    @Override
    public void initialize() {

    }

    @Override
    public void terminate() {

    }

    @Override
    public void excludeFileExtension(String fileExtension) {

    }

    @Override
    public void upload(String filePath, String destinationPath) {

    }

    @Override
    public void upload(String filePath, FileMetaData fileMetaData, String destinationPath) {

    }

    @Override
    public void uploadCollection(List<String> filePaths, String destinationPath) {

    }

    @Override
    public void download(String path) {

    }

    @Override
    public void downloadMultiple(List<String> paths) {

    }

    @Override
    public void createDir(String dirPath) {

    }

    @Override
    public List<File> findAll() {
        return null;
    }

    @Override
    public List<File> findFileByName(String name) {
        return null;
    }

    @Override
    public List<File> findFileByExtension(String extension) {
        return null;
    }

    @Override
    public List<File> findFileByParent(File parent) {
        return null;
    }

    @Override
    public List<File> findDirectory(String name) {
        return null;
    }
}
