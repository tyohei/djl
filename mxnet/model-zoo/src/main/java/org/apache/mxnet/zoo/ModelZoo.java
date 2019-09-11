/*
 * Copyright 2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance
 * with the License. A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0/
 *
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package org.apache.mxnet.zoo;

import org.apache.mxnet.zoo.cv.actionrecognition.ActionRecognitionModelLoader;
import org.apache.mxnet.zoo.cv.classification.Resnet;
import org.apache.mxnet.zoo.cv.classification.Resnext;
import org.apache.mxnet.zoo.cv.classification.SeResnext;
import org.apache.mxnet.zoo.cv.classification.Senet;
import org.apache.mxnet.zoo.cv.objectdetection.SingleShotDetectionModelLoader;
import org.apache.mxnet.zoo.cv.poseestimation.SimplePoseModelLoader;
import org.apache.mxnet.zoo.cv.segmentation.InstanceSegmentationModelLoader;
import software.amazon.ai.repository.Repository;

public interface ModelZoo {

    String MXNET_REPO_URL = "https://joule.s3.amazonaws.com/mlrepo/";
    Repository REPOSITORY = Repository.newInstance("MxNet", MXNET_REPO_URL);
    String GROUP_ID = "org.apache.mxnet";

    SingleShotDetectionModelLoader SSD = new SingleShotDetectionModelLoader(REPOSITORY);
    Resnet RESNET = new Resnet(REPOSITORY);
    Resnext RESNEXT = new Resnext(REPOSITORY);
    Senet SENET = new Senet(REPOSITORY);
    SeResnext SE_RESNEXT = new SeResnext(REPOSITORY);
    SimplePoseModelLoader SIMPLE_POSE = new SimplePoseModelLoader(REPOSITORY);
    InstanceSegmentationModelLoader MASK_RCNN = new InstanceSegmentationModelLoader(REPOSITORY);
    ActionRecognitionModelLoader ACTION_RECOGNITION = new ActionRecognitionModelLoader(REPOSITORY);
}
