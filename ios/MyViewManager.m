#import <React/RCTViewManager.h>

@interface RCT_EXTERN_MODULE(MyViewManager, RCTViewManager)

RCT_EXPORT_VIEW_PROPERTY(color, NSString)
RCT_EXPORT_VIEW_PROPERTY(onPressEvent, RCTDirectEventBlock)

@end
