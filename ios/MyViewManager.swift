import UIKit

@objc(MyViewManager)
internal class MyViewManager: RCTViewManager {
  
  override func view() -> (MyView) {
    return MyView()
  }
  
  @objc override static func requiresMainQueueSetup() -> Bool {
    return true
  }
}
