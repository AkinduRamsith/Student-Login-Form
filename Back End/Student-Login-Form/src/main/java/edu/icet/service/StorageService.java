package edu.icet.service;

import edu.icet.dao.ImageData;
import edu.icet.repository.StorageRepository;
import edu.icet.util.ImageUtil;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Optional;

@Service
public class StorageService {
    private StorageRepository storageRepository;

    public String uploadImage(MultipartFile file) throws IOException {
        ImageData imageData = storageRepository.save(ImageData.builder()
                .name(file.getOriginalFilename())
                .type(file.getContentType())
                .imageData(ImageUtil.compressImage(file.getBytes())).build());

        if(imageData!=null){
            return "file uploaded successfully"+file.getOriginalFilename();
        }

        return null;
    }

//    public byte[] downloadImage(String fileName){
//        Optional<ImageData> dbImageData = storageRepository.findByName(fileName);
//        byte[] images=ImageUtils.decompressImage(dbImageData.get().getImageData());
//        return images;
//    }
}
