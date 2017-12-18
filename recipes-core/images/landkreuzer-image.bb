# Base this image on core-image-minimal
include recipes-core/images/rpi-basic-image.bb

IMAGE_INSTALL += " \
	v4l-utils \
	"
