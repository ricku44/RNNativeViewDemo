import React from 'react';
import {
  requireNativeComponent,
  StyleProp,
  ViewStyle,
  ViewProps,
  ColorValue,
  NativeSyntheticEvent,
} from 'react-native';

export interface MyViewNativeEvent {
  dataFromNative: string;
}

type OnPressEvent = (data: NativeSyntheticEvent<MyViewNativeEvent>) => void;

interface MyViewProps extends ViewProps {
  color?: ColorValue;
  onPressEvent?: OnPressEvent;
  style?: StyleProp<ViewStyle>;
}

const MyNativeView = React.memo(requireNativeComponent<MyViewProps>('MyView'));

export default MyNativeView;
