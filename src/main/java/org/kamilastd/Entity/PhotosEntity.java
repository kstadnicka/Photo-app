package org.kamilastd.Entity;

import lombok.Data;

@Data
public class PhotosEntity {
    Boolean isPhotosSentToClientForChoose;
    Boolean isPhotosChosenByClient;
    Boolean isAdditionalPhotosChosenByClient;
}
