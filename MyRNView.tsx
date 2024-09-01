import React from 'react';
import {View, Text} from 'react-native';

export default function MyRNView(): React.JSX.Element {
  return (
    <View
      style={{
        flex: 1,
        alignItems: 'center',
        justifyContent: 'center',
        backgroundColor: 'green',
      }}>
      <Text>React Native View</Text>
    </View>
  );
}
