import React from 'react';
import {SafeAreaView, View, Alert, NativeSyntheticEvent} from 'react-native';
import MyNativeView, {MyViewNativeEvent} from './MyNativeView';
import MyRNView from './MyRNView';

function App(): React.JSX.Element {
  return (
    <SafeAreaView>
      <View
        style={{
          height: '100%',
          padding: 10,
        }}>
        <MyNativeView
          color="red"
          style={{flex: 1}}
          onPressEvent={React.useCallback(
            (event: NativeSyntheticEvent<MyViewNativeEvent>) => {
              Alert.alert('Pressed', event.nativeEvent.dataFromNative);
            },
            [],
          )}
        />
        <MyRNView />
      </View>
    </SafeAreaView>
  );
}

export default App;
