class MyView: UIView {
  @objc var color: String? {
    didSet {
      updateBackgroundColor()
    }
  }
  @objc var onPressEvent: RCTDirectEventBlock?
  
  override init(frame: CGRect) {
    super.init(frame: frame)
    self.setupView()
  }
  
  required init?(coder: NSCoder) {
    super.init(coder: coder)
    self.setupView()
  }
  
  private func setupView() {
    let tapGestureRecognizer = UITapGestureRecognizer(target: self, action: #selector(handleTap))
    self.addGestureRecognizer(tapGestureRecognizer)
    
    let label = UILabel()
    label.text = "Native View"
    label.translatesAutoresizingMaskIntoConstraints = false
    self.addSubview(label)
    
    NSLayoutConstraint.activate([
      label.centerXAnchor.constraint(equalTo: self.centerXAnchor),
      label.centerYAnchor.constraint(equalTo: self.centerYAnchor),
      label.widthAnchor.constraint(lessThanOrEqualTo: self.widthAnchor),
      label.heightAnchor.constraint(lessThanOrEqualTo: self.heightAnchor)
    ])
    
  }
  
  private func updateBackgroundColor() {
    self.backgroundColor = {
      switch color?.lowercased() ?? "blue" {
        case "red":
          return .red
        case "blue":
          return .blue
        case "green":
          return .green
        case "yellow":
          return .yellow
        case "black":
          return .black
        case "white":
          return .white
        default:
          return .blue
      }
    }()
  }
  
  @objc private func handleTap() {
    onPressEvent?(["dataFromNative": "Hello!!!"])
  }
}
